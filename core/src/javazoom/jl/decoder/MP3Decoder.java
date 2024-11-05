package javazoom.jl.decoder;

public class MP3Decoder {

    private OutputBuffer output;
    private SynthesisFilter filter1;
    private SynthesisFilter filter2;
    private LayerIIIDecoder l3decoder;
    private LayerIIDecoder l2decoder;
    private LayerIDecoder l1decoder;
    private int outputFrequency;
    private int outputChannels;
    private boolean initialized;
    public static final int DECODER_ERROR = 512;
    public static final int UNKNOWN_ERROR = 512;
    public static final int UNSUPPORTED_LAYER = 513;
    public static final int ILLEGAL_SUBBAND_ALLOCATION = 514;

    public OutputBuffer decodeFrame(Header var1, Bitstream var2) throws DecoderException {
        if (!this.initialized) {
            this.initialize(var1);
        }

        int var3 = var1.layer();
        FrameDecoder var4 = this.retrieveDecoder(var1, var2, var3);
        var4.decodeFrame();
        return this.output;
    }

    public void setOutputBuffer(OutputBuffer var1) {
        this.output = var1;
    }

    public int getOutputFrequency() {
        return this.outputFrequency;
    }

    public int getOutputChannels() {
        return this.outputChannels;
    }

    protected DecoderException newDecoderException(int var1) {
        return new DecoderException(var1, (Throwable) null);
    }

    protected DecoderException newDecoderException(int var1, Throwable var2) {
        return new DecoderException(var1, var2);
    }

    protected FrameDecoder retrieveDecoder(Header var1, Bitstream var2, int var3) throws DecoderException {
        Object var4 = null;
        switch (var3) {
            case 1:
                if (this.l1decoder == null) {
                    this.l1decoder = new LayerIDecoder();
                    this.l1decoder.create(var2, var1, this.filter1, this.filter2, this.output, 0);
                }

                var4 = this.l1decoder;
                break;
            case 2:
                if (this.l2decoder == null) {
                    this.l2decoder = new LayerIIDecoder();
                    this.l2decoder.create(var2, var1, this.filter1, this.filter2, this.output, 0);
                }

                var4 = this.l2decoder;
                break;
            case 3:
                if (this.l3decoder == null) {
                    this.l3decoder = new LayerIIIDecoder(var2, var1, this.filter1, this.filter2, this.output, 0);
                }

                var4 = this.l3decoder;
        }

        if (var4 == null) {
            throw this.newDecoderException(513, (Throwable) null);
        } else {
            return (FrameDecoder) var4;
        }
    }

    private void initialize(Header var1) {
        float var2 = 32700.0F;
        int var3 = var1.mode();
        var1.layer();
        int var4 = var3 == 3 ? 1 : 2;
        if (this.output == null) {
            throw new RuntimeException("Output buffer was not set.");
        } else {
            this.filter1 = new SynthesisFilter(0, var2, (float[]) null);
            if (var4 == 2) {
                this.filter2 = new SynthesisFilter(1, var2, (float[]) null);
            }

            this.outputChannels = var4;
            this.outputFrequency = var1.frequency();
            this.initialized = true;
        }
    }
}
