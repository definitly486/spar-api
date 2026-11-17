package io.appmetrica.analytics.network.impl;

import gg.wwaezpbzkn;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rg.zoijcleaow;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static byte[] a(int i13, iobyxmoadg iobyxmoadgVar) {
        try {
            InputStream inputStream = (InputStream) iobyxmoadgVar.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i14 = 0;
                            while (true) {
                                int i15 = inputStream.read(bArr);
                                if (-1 == i15 || i14 > i13) {
                                    break;
                                    break;
                                }
                                if (i15 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i15);
                                    i14 += i15;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            zoijcleaow.iobyxmoadg(byteArrayOutputStream, null);
                            zoijcleaow.iobyxmoadg(inputStream, null);
                            return byteArray;
                        } catch (Throwable unused) {
                            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                            zoijcleaow.iobyxmoadg(byteArrayOutputStream, null);
                            zoijcleaow.iobyxmoadg(inputStream, null);
                            return new byte[0];
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            zoijcleaow.iobyxmoadg(byteArrayOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        zoijcleaow.iobyxmoadg(inputStream, th4);
                        throw th5;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
