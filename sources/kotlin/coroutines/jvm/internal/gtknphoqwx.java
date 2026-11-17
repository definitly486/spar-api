package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx extends btonecajqb implements ojitshcjhn {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f59995zdlpuopuiu;

    public gtknphoqwx(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f59995zdlpuopuiu = i13;
    }

    @Override // kotlin.jvm.internal.ojitshcjhn
    public int getArity() {
        return this.f59995zdlpuopuiu;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strDxjokdxxww = cllcsxoeiz.dxjokdxxww(this);
        zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "renderLambdaToString(...)");
        return strDxjokdxxww;
    }
}
