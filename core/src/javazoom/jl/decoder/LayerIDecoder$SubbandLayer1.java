package javazoom.jl.decoder;

import java.util.logging.Level;
import java.util.logging.Logger;

class LayerIDecoder$SubbandLayer1 extends LayerIDecoder$Subband {

    public static final float[] table_factor = new float[]{0.0F, 0.6666667F, 0.2857143F, 0.13333334F, 0.06451613F, 0.031746034F, 0.015748031F, 0.007843138F, 0.0039138943F, 0.0019550342F, 9.770396E-4F, 4.884005E-4F, 2.4417043E-4F, 1.2207776E-4F, 6.103702E-5F};
    public static final float[] table_offset = new float[]{0.0F, -0.6666667F, -0.85714287F, -0.93333334F, -0.9677419F, -0.984127F, -0.992126F, -0.99607843F, -0.99804306F, -0.9990225F, -0.9995115F, -0.9997558F, -0.9998779F, -0.99993896F, -0.9999695F};
    protected int subbandnumber;
    protected int samplenumber;
    protected int allocation;
    protected float scalefactor;
    protected int samplelength;
    protected float sample;
    protected float factor;
    protected float offset;

    public LayerIDecoder$SubbandLayer1(int var1) {
        this.subbandnumber = var1;
        this.samplenumber = 0;
    }

    public void read_allocation(Bitstream var1, Header var2, Crc16 var3) {
        if ((this.allocation = var1.get_bits(4)) == 15) {
            try {
                throw new DecoderException(514, (Throwable) null);
            } catch (DecoderException ex) {
                Logger.getLogger(LayerIDecoder$SubbandLayer1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (var3 != null) {
                var3.add_bits(this.allocation, 4);
            }

            if (this.allocation != 0) {
                this.samplelength = this.allocation + 1;
                this.factor = table_factor[this.allocation];
                this.offset = table_offset[this.allocation];
            }

        }
    }

    public void read_scalefactor(Bitstream var1, Header var2) {
        if (this.allocation != 0) {
            this.scalefactor = LayerIDecoder.scalefactors[var1.get_bits(6)];
        }

    }

    public boolean read_sampledata(Bitstream var1) {
        if (this.allocation != 0) {
            this.sample = (float) var1.get_bits(this.samplelength);
        }

        if (++this.samplenumber == 12) {
            this.samplenumber = 0;
            return true;
        } else {
            return false;
        }
    }

    public boolean put_next_sample(int var1, SynthesisFilter var2, SynthesisFilter var3) {
        if (this.allocation != 0 && var1 != 2) {
            float var4 = (this.sample * this.factor + this.offset) * this.scalefactor;
            var2.input_sample(var4, this.subbandnumber);
        }

        return true;
    }
}
