package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class Ud implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wd f46610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Td f46611b;

    public Ud(Wd wd2, Td td2) {
        this.f46610a = wd2;
        this.f46611b = td2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String apply(File file) {
        byte[] bArrPpxfxbqfkf;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                    try {
                        bArrPpxfxbqfkf = rg.iobyxmoadg.ppxfxbqfkf(fileInputStream);
                        io.a((Closeable) fileInputStream);
                    } catch (Throwable unused) {
                        io.a((Closeable) fileInputStream);
                        bArrPpxfxbqfkf = null;
                    }
                } catch (Throwable unused2) {
                    fileInputStream = null;
                }
            } else {
                bArrPpxfxbqfkf = null;
            }
            if (bArrPpxfxbqfkf == null) {
                return null;
            }
            if (bArrPpxfxbqfkf.length == 0) {
                bArrPpxfxbqfkf = null;
            }
            if (bArrPpxfxbqfkf != null) {
                return Base64Utils.compressBase64(MessageNano.toByteArray(this.f46611b.fromModel(new Zd(bArrPpxfxbqfkf, this.f46610a))));
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
