package bz;

import java.io.Serializable;
import zone.bi.mobile.fingerprint.api.FingerprintGeneralException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n0 extends Exception {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f17535yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f17536zdlpuopuiu;

    n0(String str, String str2, int i13) {
        super(str);
        this.f17536zdlpuopuiu = str2;
        this.f17535yggfygwlhe = i13;
    }

    public Serializable iobyxmoadg(kc2.lqeggnwhkg lqeggnwhkgVar) {
        Class clsNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu();
        if (clsNufgyqmvbu == String.class) {
            return this.f17536zdlpuopuiu;
        }
        if (clsNufgyqmvbu == Integer.class) {
            return Integer.valueOf(this.f17535yggfygwlhe);
        }
        if (clsNufgyqmvbu == Boolean.class) {
            return Boolean.FALSE;
        }
        if (clsNufgyqmvbu == oc2.ppxfxbqfkf.class) {
            return new oc2.ppxfxbqfkf();
        }
        if (clsNufgyqmvbu == oc2.iobyxmoadg.class) {
            return new oc2.iobyxmoadg();
        }
        throw new FingerprintGeneralException("Unsupported valueClass: " + clsNufgyqmvbu.getCanonicalName());
    }

    n0(String str, Throwable th2, String str2, int i13) {
        super(str, th2);
        this.f17536zdlpuopuiu = str2;
        this.f17535yggfygwlhe = i13;
    }
}
