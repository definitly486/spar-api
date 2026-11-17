package retrofit2;

import java.util.Objects;
import lm.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final transient kcexrzcfyt f82561jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f82562yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f82563zdlpuopuiu;

    public HttpException(kcexrzcfyt kcexrzcfytVar) {
        super(wkgbmnqykc(kcexrzcfytVar));
        this.f82563zdlpuopuiu = kcexrzcfytVar.zoijcleaow();
        this.f82562yggfygwlhe = kcexrzcfytVar.lqeggnwhkg();
        this.f82561jyumaefscl = kcexrzcfytVar;
    }

    private static String wkgbmnqykc(kcexrzcfyt kcexrzcfytVar) {
        Objects.requireNonNull(kcexrzcfytVar, "response == null");
        return "HTTP " + kcexrzcfytVar.zoijcleaow() + " " + kcexrzcfytVar.lqeggnwhkg();
    }

    public int iobyxmoadg() {
        return this.f82563zdlpuopuiu;
    }
}
