package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class draadjrbmk extends wkgbmnqykc implements ojitshcjhn {
    private final int arity;

    public draadjrbmk(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.arity = i13;
    }

    @Override // kotlin.jvm.internal.ojitshcjhn
    public int getArity() {
        return this.arity;
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
