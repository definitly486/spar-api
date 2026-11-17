package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzfb extends OutputStream {
    private long zza = 0;

    zzfb() {
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        this.zza++;
    }

    final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        int length;
        int i15;
        if (i13 >= 0 && i13 <= (length = bArr.length) && i14 >= 0 && (i15 = i13 + i14) <= length && i15 >= 0) {
            this.zza += (long) i14;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
