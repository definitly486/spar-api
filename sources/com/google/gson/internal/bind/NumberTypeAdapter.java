package com.google.gson.internal.bind;

import ce.ppxfxbqfkf;
import ce.zoijcleaow;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.ojitshcjhn;
import com.google.gson.rgvfuqvkyq;
import com.google.gson.vdvldrhtss;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberTypeAdapter extends TypeAdapter {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final vdvldrhtss f24985zoijcleaow = gxszxtbevo(ojitshcjhn.f25189yggfygwlhe);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f24986iobyxmoadg;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f24988iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            f24988iobyxmoadg = iArr;
            try {
                iArr[zoijcleaow.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24988iobyxmoadg[zoijcleaow.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24988iobyxmoadg[zoijcleaow.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(rgvfuqvkyq rgvfuqvkyqVar) {
        this.f24986iobyxmoadg = rgvfuqvkyqVar;
    }

    public static vdvldrhtss eablkybsjg(rgvfuqvkyq rgvfuqvkyqVar) {
        return rgvfuqvkyqVar == ojitshcjhn.f25189yggfygwlhe ? f24985zoijcleaow : gxszxtbevo(rgvfuqvkyqVar);
    }

    private static vdvldrhtss gxszxtbevo(rgvfuqvkyq rgvfuqvkyqVar) {
        return new vdvldrhtss() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.vdvldrhtss
            public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
                if (iobyxmoadgVar.ppxfxbqfkf() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public Number zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
        zoijcleaow zoijcleaowVarKegysxyocb = iobyxmoadgVar.kegysxyocb();
        int i13 = iobyxmoadg.f24988iobyxmoadg[zoijcleaowVarKegysxyocb.ordinal()];
        if (i13 == 1) {
            iobyxmoadgVar.wwaezpbzkn();
            return null;
        }
        if (i13 == 2 || i13 == 3) {
            return this.f24986iobyxmoadg.iobyxmoadg(iobyxmoadgVar);
        }
        throw new JsonSyntaxException("Expecting number, got: " + zoijcleaowVarKegysxyocb + "; at path " + iobyxmoadgVar.gxszxtbevo());
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Number number) throws IOException {
        ppxfxbqfkfVar.ntlheqmsrt(number);
    }
}
