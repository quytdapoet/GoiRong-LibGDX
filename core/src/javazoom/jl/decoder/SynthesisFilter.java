package javazoom.jl.decoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;

public final class SynthesisFilter {

    private float[] v1;
    private float[] v2;
    private float[] actual_v;
    private int actual_write_pos;
    private float[] samples;
    private int channel;
    private float scalefactor;
    private float[] _tmpOut = new float[32];
    private static final double MY_PI = 3.141592653589793D;
    private static final float cos1_64 = (float) (1.0D / (2.0D * Math.cos(0.04908738521234052D)));
    private static final float cos3_64 = (float) (1.0D / (2.0D * Math.cos(0.14726215563702155D)));
    private static final float cos5_64 = (float) (1.0D / (2.0D * Math.cos(0.2454369260617026D)));
    private static final float cos7_64 = (float) (1.0D / (2.0D * Math.cos(0.3436116964863836D)));
    private static final float cos9_64 = (float) (1.0D / (2.0D * Math.cos(0.44178646691106466D)));
    private static final float cos11_64 = (float) (1.0D / (2.0D * Math.cos(0.5399612373357456D)));
    private static final float cos13_64 = (float) (1.0D / (2.0D * Math.cos(0.6381360077604268D)));
    private static final float cos15_64 = (float) (1.0D / (2.0D * Math.cos(0.7363107781851077D)));
    private static final float cos17_64 = (float) (1.0D / (2.0D * Math.cos(0.8344855486097889D)));
    private static final float cos19_64 = (float) (1.0D / (2.0D * Math.cos(0.9326603190344698D)));
    private static final float cos21_64 = (float) (1.0D / (2.0D * Math.cos(1.030835089459151D)));
    private static final float cos23_64 = (float) (1.0D / (2.0D * Math.cos(1.1290098598838318D)));
    private static final float cos25_64 = (float) (1.0D / (2.0D * Math.cos(1.227184630308513D)));
    private static final float cos27_64 = (float) (1.0D / (2.0D * Math.cos(1.325359400733194D)));
    private static final float cos29_64 = (float) (1.0D / (2.0D * Math.cos(1.423534171157875D)));
    private static final float cos31_64 = (float) (1.0D / (2.0D * Math.cos(1.521708941582556D)));
    private static final float cos1_32 = (float) (1.0D / (2.0D * Math.cos(0.09817477042468103D)));
    private static final float cos3_32 = (float) (1.0D / (2.0D * Math.cos(0.2945243112740431D)));
    private static final float cos5_32 = (float) (1.0D / (2.0D * Math.cos(0.4908738521234052D)));
    private static final float cos7_32 = (float) (1.0D / (2.0D * Math.cos(0.6872233929727672D)));
    private static final float cos9_32 = (float) (1.0D / (2.0D * Math.cos(0.8835729338221293D)));
    private static final float cos11_32 = (float) (1.0D / (2.0D * Math.cos(1.0799224746714913D)));
    private static final float cos13_32 = (float) (1.0D / (2.0D * Math.cos(1.2762720155208536D)));
    private static final float cos15_32 = (float) (1.0D / (2.0D * Math.cos(1.4726215563702154D)));
    private static final float cos1_16 = (float) (1.0D / (2.0D * Math.cos(0.19634954084936207D)));
    private static final float cos3_16 = (float) (1.0D / (2.0D * Math.cos(0.5890486225480862D)));
    private static final float cos5_16 = (float) (1.0D / (2.0D * Math.cos(0.9817477042468103D)));
    private static final float cos7_16 = (float) (1.0D / (2.0D * Math.cos(1.3744467859455345D)));
    private static final float cos1_8 = (float) (1.0D / (2.0D * Math.cos(0.39269908169872414D)));
    private static final float cos3_8 = (float) (1.0D / (2.0D * Math.cos(1.1780972450961724D)));
    private static final float cos1_4 = (float) (1.0D / (2.0D * Math.cos(0.7853981633974483D)));
    private static float[] d = null;
    private static float[][] d16 = (float[][]) null;

    public SynthesisFilter(int var1, float var2, float[] var3) {
        if (d == null) {
            d = load_d();
            d16 = splitArray(d, 16);
        }

        this.v1 = new float[512];
        this.v2 = new float[512];
        this.samples = new float[32];
        this.channel = var1;
        this.scalefactor = var2;
        this.reset();
    }

    public void reset() {
        int var1;
        for (var1 = 0; var1 < 512; ++var1) {
            this.v1[var1] = this.v2[var1] = 0.0F;
        }

        for (var1 = 0; var1 < 32; ++var1) {
            this.samples[var1] = 0.0F;
        }

        this.actual_v = this.v1;
        this.actual_write_pos = 15;
    }

    public void input_sample(float var1, int var2) {
        this.samples[var2] = var1;
    }

    public void input_samples(float[] var1) {
        for (int var2 = 31; var2 >= 0; --var2) {
            this.samples[var2] = var1[var2];
        }

    }

    private void compute_new_v() {
        float[] var33 = this.samples;
        float var34 = var33[0];
        float var35 = var33[1];
        float var36 = var33[2];
        float var37 = var33[3];
        float var38 = var33[4];
        float var39 = var33[5];
        float var40 = var33[6];
        float var41 = var33[7];
        float var42 = var33[8];
        float var43 = var33[9];
        float var44 = var33[10];
        float var45 = var33[11];
        float var46 = var33[12];
        float var47 = var33[13];
        float var48 = var33[14];
        float var49 = var33[15];
        float var50 = var33[16];
        float var51 = var33[17];
        float var52 = var33[18];
        float var53 = var33[19];
        float var54 = var33[20];
        float var55 = var33[21];
        float var56 = var33[22];
        float var57 = var33[23];
        float var58 = var33[24];
        float var59 = var33[25];
        float var60 = var33[26];
        float var61 = var33[27];
        float var62 = var33[28];
        float var63 = var33[29];
        float var64 = var33[30];
        float var65 = var33[31];
        float var66 = var34 + var65;
        float var67 = var35 + var64;
        float var68 = var36 + var63;
        float var69 = var37 + var62;
        float var70 = var38 + var61;
        float var71 = var39 + var60;
        float var72 = var40 + var59;
        float var73 = var41 + var58;
        float var74 = var42 + var57;
        float var75 = var43 + var56;
        float var76 = var44 + var55;
        float var77 = var45 + var54;
        float var78 = var46 + var53;
        float var79 = var47 + var52;
        float var80 = var48 + var51;
        float var81 = var49 + var50;
        float var82 = var66 + var81;
        float var83 = var67 + var80;
        float var84 = var68 + var79;
        float var85 = var69 + var78;
        float var86 = var70 + var77;
        float var87 = var71 + var76;
        float var88 = var72 + var75;
        float var89 = var73 + var74;
        float var90 = (var66 - var81) * cos1_32;
        float var91 = (var67 - var80) * cos3_32;
        float var92 = (var68 - var79) * cos5_32;
        float var93 = (var69 - var78) * cos7_32;
        float var94 = (var70 - var77) * cos9_32;
        float var95 = (var71 - var76) * cos11_32;
        float var96 = (var72 - var75) * cos13_32;
        float var97 = (var73 - var74) * cos15_32;
        var66 = var82 + var89;
        var67 = var83 + var88;
        var68 = var84 + var87;
        var69 = var85 + var86;
        var70 = (var82 - var89) * cos1_16;
        var71 = (var83 - var88) * cos3_16;
        var72 = (var84 - var87) * cos5_16;
        var73 = (var85 - var86) * cos7_16;
        var74 = var90 + var97;
        var75 = var91 + var96;
        var76 = var92 + var95;
        var77 = var93 + var94;
        var78 = (var90 - var97) * cos1_16;
        var79 = (var91 - var96) * cos3_16;
        var80 = (var92 - var95) * cos5_16;
        var81 = (var93 - var94) * cos7_16;
        var82 = var66 + var69;
        var83 = var67 + var68;
        var84 = (var66 - var69) * cos1_8;
        var85 = (var67 - var68) * cos3_8;
        var86 = var70 + var73;
        var87 = var71 + var72;
        var88 = (var70 - var73) * cos1_8;
        var89 = (var71 - var72) * cos3_8;
        var90 = var74 + var77;
        var91 = var75 + var76;
        var92 = (var74 - var77) * cos1_8;
        var93 = (var75 - var76) * cos3_8;
        var94 = var78 + var81;
        var95 = var79 + var80;
        var96 = (var78 - var81) * cos1_8;
        var97 = (var79 - var80) * cos3_8;
        var66 = var82 + var83;
        var67 = (var82 - var83) * cos1_4;
        var68 = var84 + var85;
        var69 = (var84 - var85) * cos1_4;
        var70 = var86 + var87;
        var71 = (var86 - var87) * cos1_4;
        var72 = var88 + var89;
        var73 = (var88 - var89) * cos1_4;
        var74 = var90 + var91;
        var75 = (var90 - var91) * cos1_4;
        var76 = var92 + var93;
        var77 = (var92 - var93) * cos1_4;
        var78 = var94 + var95;
        var79 = (var94 - var95) * cos1_4;
        var80 = var96 + var97;
        var81 = (var96 - var97) * cos1_4;
        float var13 = var73;
        float var5;
        float var20 = -(var5 = var73 + var71) - var72;
        float var28 = -var72 - var73 - var70;
        float var15 = var81;
        float var11;
        float var7 = (var11 = var81 + var77) + var79;
        float var3;
        float var18 = -(var3 = var81 + var79 + var75) - var80;
        float var98;
        float var22 = (var98 = -var80 - var81 - var76 - var77) - var79;
        float var30 = -var80 - var81 - var78 - var74;
        float var26 = var98 - var78;
        float var32 = -var66;
        float var1 = var67;
        float var9 = var69;
        float var24 = -var69 - var68;
        var66 = (var34 - var65) * cos1_64;
        var67 = (var35 - var64) * cos3_64;
        var68 = (var36 - var63) * cos5_64;
        var69 = (var37 - var62) * cos7_64;
        var70 = (var38 - var61) * cos9_64;
        var71 = (var39 - var60) * cos11_64;
        var72 = (var40 - var59) * cos13_64;
        var73 = (var41 - var58) * cos15_64;
        var74 = (var42 - var57) * cos17_64;
        var75 = (var43 - var56) * cos19_64;
        var76 = (var44 - var55) * cos21_64;
        var77 = (var45 - var54) * cos23_64;
        var78 = (var46 - var53) * cos25_64;
        var79 = (var47 - var52) * cos27_64;
        var80 = (var48 - var51) * cos29_64;
        var81 = (var49 - var50) * cos31_64;
        var82 = var66 + var81;
        var83 = var67 + var80;
        var84 = var68 + var79;
        var85 = var69 + var78;
        var86 = var70 + var77;
        var87 = var71 + var76;
        var88 = var72 + var75;
        var89 = var73 + var74;
        var90 = (var66 - var81) * cos1_32;
        var91 = (var67 - var80) * cos3_32;
        var92 = (var68 - var79) * cos5_32;
        var93 = (var69 - var78) * cos7_32;
        var94 = (var70 - var77) * cos9_32;
        var95 = (var71 - var76) * cos11_32;
        var96 = (var72 - var75) * cos13_32;
        var97 = (var73 - var74) * cos15_32;
        var66 = var82 + var89;
        var67 = var83 + var88;
        var68 = var84 + var87;
        var69 = var85 + var86;
        var70 = (var82 - var89) * cos1_16;
        var71 = (var83 - var88) * cos3_16;
        var72 = (var84 - var87) * cos5_16;
        var73 = (var85 - var86) * cos7_16;
        var74 = var90 + var97;
        var75 = var91 + var96;
        var76 = var92 + var95;
        var77 = var93 + var94;
        var78 = (var90 - var97) * cos1_16;
        var79 = (var91 - var96) * cos3_16;
        var80 = (var92 - var95) * cos5_16;
        var81 = (var93 - var94) * cos7_16;
        var82 = var66 + var69;
        var83 = var67 + var68;
        var84 = (var66 - var69) * cos1_8;
        var85 = (var67 - var68) * cos3_8;
        var86 = var70 + var73;
        var87 = var71 + var72;
        var88 = (var70 - var73) * cos1_8;
        var89 = (var71 - var72) * cos3_8;
        var90 = var74 + var77;
        var91 = var75 + var76;
        var92 = (var74 - var77) * cos1_8;
        var93 = (var75 - var76) * cos3_8;
        var94 = var78 + var81;
        var95 = var79 + var80;
        var96 = (var78 - var81) * cos1_8;
        var97 = (var79 - var80) * cos3_8;
        var66 = var82 + var83;
        var67 = (var82 - var83) * cos1_4;
        var68 = var84 + var85;
        var69 = (var84 - var85) * cos1_4;
        var70 = var86 + var87;
        var71 = (var86 - var87) * cos1_4;
        var72 = var88 + var89;
        var73 = (var88 - var89) * cos1_4;
        var74 = var90 + var91;
        var75 = (var90 - var91) * cos1_4;
        var76 = var92 + var93;
        var77 = (var92 - var93) * cos1_4;
        var78 = var94 + var95;
        var79 = (var94 - var95) * cos1_4;
        var80 = var96 + var97;
        var81 = (var96 - var97) * cos1_4;
        float var12;
        float var14;
        float var6 = (var12 = (var14 = var81 + var73) + var77) + var71 + var79;
        float var10;
        float var8 = (var10 = var81 + var77 + var69) + var79;
        float var2;
        float var17 = -(var2 = (var98 = var79 + var81 + var75) + var67) - var80;
        float var4;
        float var19 = -(var4 = var98 + var71 + var73) - var72 - var80;
        float var23 = (var98 = -var76 - var77 - var80 - var81) - var79 - var68 - var69;
        float var21 = var98 - var79 - var71 - var72 - var73;
        float var25 = var98 - var78 - var68 - var69;
        float var99;
        float var27 = var98 - var78 - (var99 = var70 + var72 + var73);
        float var31 = (var98 = -var74 - var78 - var80 - var81) - var66;
        float var29 = var98 - var99;
        float[] var100 = this.actual_v;
        int var101 = this.actual_write_pos;
        var100[0 + var101] = var1;
        var100[16 + var101] = var2;
        var100[32 + var101] = var3;
        var100[48 + var101] = var4;
        var100[64 + var101] = var5;
        var100[80 + var101] = var6;
        var100[96 + var101] = var7;
        var100[112 + var101] = var8;
        var100[128 + var101] = var9;
        var100[144 + var101] = var10;
        var100[160 + var101] = var11;
        var100[176 + var101] = var12;
        var100[192 + var101] = var13;
        var100[208 + var101] = var14;
        var100[224 + var101] = var15;
        var100[240 + var101] = var81;
        var100[256 + var101] = 0.0F;
        var100[272 + var101] = -var81;
        var100[288 + var101] = -var15;
        var100[304 + var101] = -var14;
        var100[320 + var101] = -var13;
        var100[336 + var101] = -var12;
        var100[352 + var101] = -var11;
        var100[368 + var101] = -var10;
        var100[384 + var101] = -var9;
        var100[400 + var101] = -var8;
        var100[416 + var101] = -var7;
        var100[432 + var101] = -var6;
        var100[448 + var101] = -var5;
        var100[464 + var101] = -var4;
        var100[480 + var101] = -var3;
        var100[496 + var101] = -var2;
        var100 = this.actual_v == this.v1 ? this.v2 : this.v1;
        var100[0 + var101] = -var1;
        var100[16 + var101] = var17;
        var100[32 + var101] = var18;
        var100[48 + var101] = var19;
        var100[64 + var101] = var20;
        var100[80 + var101] = var21;
        var100[96 + var101] = var22;
        var100[112 + var101] = var23;
        var100[128 + var101] = var24;
        var100[144 + var101] = var25;
        var100[160 + var101] = var26;
        var100[176 + var101] = var27;
        var100[192 + var101] = var28;
        var100[208 + var101] = var29;
        var100[224 + var101] = var30;
        var100[240 + var101] = var31;
        var100[256 + var101] = var32;
        var100[272 + var101] = var31;
        var100[288 + var101] = var30;
        var100[304 + var101] = var29;
        var100[320 + var101] = var28;
        var100[336 + var101] = var27;
        var100[352 + var101] = var26;
        var100[368 + var101] = var25;
        var100[384 + var101] = var24;
        var100[400 + var101] = var23;
        var100[416 + var101] = var22;
        var100[432 + var101] = var21;
        var100[448 + var101] = var20;
        var100[464 + var101] = var19;
        var100[480 + var101] = var18;
        var100[496 + var101] = var17;
    }

    private void compute_pcm_samples0(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var7 = d16[var5];
            float var6 = (var2[0 + var4] * var7[0] + var2[15 + var4] * var7[1] + var2[14 + var4] * var7[2] + var2[13 + var4] * var7[3] + var2[12 + var4] * var7[4] + var2[11 + var4] * var7[5] + var2[10 + var4] * var7[6] + var2[9 + var4] * var7[7] + var2[8 + var4] * var7[8] + var2[7 + var4] * var7[9] + var2[6 + var4] * var7[10] + var2[5 + var4] * var7[11] + var2[4 + var4] * var7[12] + var2[3 + var4] * var7[13] + var2[2 + var4] * var7[14] + var2[1 + var4] * var7[15]) * this.scalefactor;
            var3[var5] = var6;
            var4 += 16;
        }

    }

    private void compute_pcm_samples1(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[1 + var4] * var6[0] + var2[0 + var4] * var6[1] + var2[15 + var4] * var6[2] + var2[14 + var4] * var6[3] + var2[13 + var4] * var6[4] + var2[12 + var4] * var6[5] + var2[11 + var4] * var6[6] + var2[10 + var4] * var6[7] + var2[9 + var4] * var6[8] + var2[8 + var4] * var6[9] + var2[7 + var4] * var6[10] + var2[6 + var4] * var6[11] + var2[5 + var4] * var6[12] + var2[4 + var4] * var6[13] + var2[3 + var4] * var6[14] + var2[2 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples2(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[2 + var4] * var6[0] + var2[1 + var4] * var6[1] + var2[0 + var4] * var6[2] + var2[15 + var4] * var6[3] + var2[14 + var4] * var6[4] + var2[13 + var4] * var6[5] + var2[12 + var4] * var6[6] + var2[11 + var4] * var6[7] + var2[10 + var4] * var6[8] + var2[9 + var4] * var6[9] + var2[8 + var4] * var6[10] + var2[7 + var4] * var6[11] + var2[6 + var4] * var6[12] + var2[5 + var4] * var6[13] + var2[4 + var4] * var6[14] + var2[3 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples3(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[3 + var4] * var6[0] + var2[2 + var4] * var6[1] + var2[1 + var4] * var6[2] + var2[0 + var4] * var6[3] + var2[15 + var4] * var6[4] + var2[14 + var4] * var6[5] + var2[13 + var4] * var6[6] + var2[12 + var4] * var6[7] + var2[11 + var4] * var6[8] + var2[10 + var4] * var6[9] + var2[9 + var4] * var6[10] + var2[8 + var4] * var6[11] + var2[7 + var4] * var6[12] + var2[6 + var4] * var6[13] + var2[5 + var4] * var6[14] + var2[4 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples4(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[4 + var4] * var6[0] + var2[3 + var4] * var6[1] + var2[2 + var4] * var6[2] + var2[1 + var4] * var6[3] + var2[0 + var4] * var6[4] + var2[15 + var4] * var6[5] + var2[14 + var4] * var6[6] + var2[13 + var4] * var6[7] + var2[12 + var4] * var6[8] + var2[11 + var4] * var6[9] + var2[10 + var4] * var6[10] + var2[9 + var4] * var6[11] + var2[8 + var4] * var6[12] + var2[7 + var4] * var6[13] + var2[6 + var4] * var6[14] + var2[5 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples5(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[5 + var4] * var6[0] + var2[4 + var4] * var6[1] + var2[3 + var4] * var6[2] + var2[2 + var4] * var6[3] + var2[1 + var4] * var6[4] + var2[0 + var4] * var6[5] + var2[15 + var4] * var6[6] + var2[14 + var4] * var6[7] + var2[13 + var4] * var6[8] + var2[12 + var4] * var6[9] + var2[11 + var4] * var6[10] + var2[10 + var4] * var6[11] + var2[9 + var4] * var6[12] + var2[8 + var4] * var6[13] + var2[7 + var4] * var6[14] + var2[6 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples6(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[6 + var4] * var6[0] + var2[5 + var4] * var6[1] + var2[4 + var4] * var6[2] + var2[3 + var4] * var6[3] + var2[2 + var4] * var6[4] + var2[1 + var4] * var6[5] + var2[0 + var4] * var6[6] + var2[15 + var4] * var6[7] + var2[14 + var4] * var6[8] + var2[13 + var4] * var6[9] + var2[12 + var4] * var6[10] + var2[11 + var4] * var6[11] + var2[10 + var4] * var6[12] + var2[9 + var4] * var6[13] + var2[8 + var4] * var6[14] + var2[7 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples7(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[7 + var4] * var6[0] + var2[6 + var4] * var6[1] + var2[5 + var4] * var6[2] + var2[4 + var4] * var6[3] + var2[3 + var4] * var6[4] + var2[2 + var4] * var6[5] + var2[1 + var4] * var6[6] + var2[0 + var4] * var6[7] + var2[15 + var4] * var6[8] + var2[14 + var4] * var6[9] + var2[13 + var4] * var6[10] + var2[12 + var4] * var6[11] + var2[11 + var4] * var6[12] + var2[10 + var4] * var6[13] + var2[9 + var4] * var6[14] + var2[8 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples8(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[8 + var4] * var6[0] + var2[7 + var4] * var6[1] + var2[6 + var4] * var6[2] + var2[5 + var4] * var6[3] + var2[4 + var4] * var6[4] + var2[3 + var4] * var6[5] + var2[2 + var4] * var6[6] + var2[1 + var4] * var6[7] + var2[0 + var4] * var6[8] + var2[15 + var4] * var6[9] + var2[14 + var4] * var6[10] + var2[13 + var4] * var6[11] + var2[12 + var4] * var6[12] + var2[11 + var4] * var6[13] + var2[10 + var4] * var6[14] + var2[9 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples9(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[9 + var4] * var6[0] + var2[8 + var4] * var6[1] + var2[7 + var4] * var6[2] + var2[6 + var4] * var6[3] + var2[5 + var4] * var6[4] + var2[4 + var4] * var6[5] + var2[3 + var4] * var6[6] + var2[2 + var4] * var6[7] + var2[1 + var4] * var6[8] + var2[0 + var4] * var6[9] + var2[15 + var4] * var6[10] + var2[14 + var4] * var6[11] + var2[13 + var4] * var6[12] + var2[12 + var4] * var6[13] + var2[11 + var4] * var6[14] + var2[10 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples10(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[10 + var4] * var6[0] + var2[9 + var4] * var6[1] + var2[8 + var4] * var6[2] + var2[7 + var4] * var6[3] + var2[6 + var4] * var6[4] + var2[5 + var4] * var6[5] + var2[4 + var4] * var6[6] + var2[3 + var4] * var6[7] + var2[2 + var4] * var6[8] + var2[1 + var4] * var6[9] + var2[0 + var4] * var6[10] + var2[15 + var4] * var6[11] + var2[14 + var4] * var6[12] + var2[13 + var4] * var6[13] + var2[12 + var4] * var6[14] + var2[11 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples11(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[11 + var4] * var6[0] + var2[10 + var4] * var6[1] + var2[9 + var4] * var6[2] + var2[8 + var4] * var6[3] + var2[7 + var4] * var6[4] + var2[6 + var4] * var6[5] + var2[5 + var4] * var6[6] + var2[4 + var4] * var6[7] + var2[3 + var4] * var6[8] + var2[2 + var4] * var6[9] + var2[1 + var4] * var6[10] + var2[0 + var4] * var6[11] + var2[15 + var4] * var6[12] + var2[14 + var4] * var6[13] + var2[13 + var4] * var6[14] + var2[12 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples12(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[12 + var4] * var6[0] + var2[11 + var4] * var6[1] + var2[10 + var4] * var6[2] + var2[9 + var4] * var6[3] + var2[8 + var4] * var6[4] + var2[7 + var4] * var6[5] + var2[6 + var4] * var6[6] + var2[5 + var4] * var6[7] + var2[4 + var4] * var6[8] + var2[3 + var4] * var6[9] + var2[2 + var4] * var6[10] + var2[1 + var4] * var6[11] + var2[0 + var4] * var6[12] + var2[15 + var4] * var6[13] + var2[14 + var4] * var6[14] + var2[13 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples13(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[13 + var4] * var6[0] + var2[12 + var4] * var6[1] + var2[11 + var4] * var6[2] + var2[10 + var4] * var6[3] + var2[9 + var4] * var6[4] + var2[8 + var4] * var6[5] + var2[7 + var4] * var6[6] + var2[6 + var4] * var6[7] + var2[5 + var4] * var6[8] + var2[4 + var4] * var6[9] + var2[3 + var4] * var6[10] + var2[2 + var4] * var6[11] + var2[1 + var4] * var6[12] + var2[0 + var4] * var6[13] + var2[15 + var4] * var6[14] + var2[14 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples14(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var6 = d16[var5];
            float var7 = (var2[14 + var4] * var6[0] + var2[13 + var4] * var6[1] + var2[12 + var4] * var6[2] + var2[11 + var4] * var6[3] + var2[10 + var4] * var6[4] + var2[9 + var4] * var6[5] + var2[8 + var4] * var6[6] + var2[7 + var4] * var6[7] + var2[6 + var4] * var6[8] + var2[5 + var4] * var6[9] + var2[4 + var4] * var6[10] + var2[3 + var4] * var6[11] + var2[2 + var4] * var6[12] + var2[1 + var4] * var6[13] + var2[0 + var4] * var6[14] + var2[15 + var4] * var6[15]) * this.scalefactor;
            var3[var5] = var7;
            var4 += 16;
        }

    }

    private void compute_pcm_samples15(OutputBuffer var1) {
        float[] var2 = this.actual_v;
        float[] var3 = this._tmpOut;
        int var4 = 0;

        for (int var5 = 0; var5 < 32; ++var5) {
            float[] var7 = d16[var5];
            float var6 = (var2[15 + var4] * var7[0] + var2[14 + var4] * var7[1] + var2[13 + var4] * var7[2] + var2[12 + var4] * var7[3] + var2[11 + var4] * var7[4] + var2[10 + var4] * var7[5] + var2[9 + var4] * var7[6] + var2[8 + var4] * var7[7] + var2[7 + var4] * var7[8] + var2[6 + var4] * var7[9] + var2[5 + var4] * var7[10] + var2[4 + var4] * var7[11] + var2[3 + var4] * var7[12] + var2[2 + var4] * var7[13] + var2[1 + var4] * var7[14] + var2[0 + var4] * var7[15]) * this.scalefactor;
            var3[var5] = var6;
            var4 += 16;
        }

    }

    private void compute_pcm_samples(OutputBuffer var1) {
        switch (this.actual_write_pos) {
            case 0:
                this.compute_pcm_samples0(var1);
                break;
            case 1:
                this.compute_pcm_samples1(var1);
                break;
            case 2:
                this.compute_pcm_samples2(var1);
                break;
            case 3:
                this.compute_pcm_samples3(var1);
                break;
            case 4:
                this.compute_pcm_samples4(var1);
                break;
            case 5:
                this.compute_pcm_samples5(var1);
                break;
            case 6:
                this.compute_pcm_samples6(var1);
                break;
            case 7:
                this.compute_pcm_samples7(var1);
                break;
            case 8:
                this.compute_pcm_samples8(var1);
                break;
            case 9:
                this.compute_pcm_samples9(var1);
                break;
            case 10:
                this.compute_pcm_samples10(var1);
                break;
            case 11:
                this.compute_pcm_samples11(var1);
                break;
            case 12:
                this.compute_pcm_samples12(var1);
                break;
            case 13:
                this.compute_pcm_samples13(var1);
                break;
            case 14:
                this.compute_pcm_samples14(var1);
                break;
            case 15:
                this.compute_pcm_samples15(var1);
        }

        if (var1 != null) {
            var1.appendSamples(this.channel, this._tmpOut);
        }

    }

    public void calculate_pcm_samples(OutputBuffer var1) {
        this.compute_new_v();
        this.compute_pcm_samples(var1);
        this.actual_write_pos = this.actual_write_pos + 1 & 15;
        this.actual_v = this.actual_v == this.v1 ? this.v2 : this.v1;

        for (int var2 = 0; var2 < 32; ++var2) {
            this.samples[var2] = 0.0F;
        }

    }

    private static float[] load_d() {
        try {
            Class var0 = Float.TYPE;
            Object var1 = deserializeArray(SynthesisFilter.class.getResourceAsStream("/sfd.ser"), var0, 512);
            return (float[]) ((float[]) var1);
        } catch (IOException var2) {
            throw new ExceptionInInitializerError(var2);
        }
    }

    private static Object deserializeArray(InputStream var0, Class var1, int var2) throws InvalidObjectException, IOException {
        if (var1 == null) {
            throw new NullPointerException("elemType");
        } else if (var2 < -1) {
            throw new IllegalArgumentException("length");
        } else {
            Object var3 = deserialize(var0);
            Class var4 = var3.getClass();
            if (!var4.isArray()) {
                throw new InvalidObjectException("object is not an array");
            } else {
                Class var5 = var4.getComponentType();
                if (var5 != var1) {
                    throw new InvalidObjectException("unexpected array component type");
                } else {
                    if (var2 != -1) {
                        int var6 = Array.getLength(var3);
                        if (var6 != var2) {
                            throw new InvalidObjectException("array length mismatch");
                        }
                    }

                    return var3;
                }
            }
        }
    }

    public static Object deserialize(InputStream var0) throws InvalidClassException, IOException {
        if (var0 == null) {
            throw new NullPointerException("in");
        } else {
            ObjectInputStream var1 = new ObjectInputStream(var0);

            try {
                Object var2 = var1.readObject();
                return var2;
            } catch (ClassNotFoundException var4) {
                throw new InvalidClassException(var4.toString());
            }
        }
    }

    private static float[][] splitArray(float[] var0, int var1) {
        int var2 = var0.length / var1;
        float[][] var3 = new float[var2][];

        for (int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = subArray(var0, var4 * var1, var1);
        }

        return var3;
    }

    private static float[] subArray(float[] var0, int var1, int var2) {
        if (var1 + var2 > var0.length) {
            var2 = var0.length - var1;
        }

        if (var2 < 0) {
            var2 = 0;
        }

        float[] var3 = new float[var2];

        for (int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var0[var1 + var4];
        }

        return var3;
    }
}
