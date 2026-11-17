package com.google.common.primitives;

import xa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {
    public static byte iobyxmoadg(long j13) {
        draadjrbmk.lqeggnwhkg((j13 >> 8) == 0, "out of range: %s", j13);
        return (byte) j13;
    }

    public static int zoijcleaow(byte b13) {
        return b13 & 255;
    }
}
