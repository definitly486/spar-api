package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jyumaefscl implements ojitshcjhn, Serializable {
    private final int arity;

    public jyumaefscl(int i13) {
        this.arity = i13;
    }

    @Override // kotlin.jvm.internal.ojitshcjhn
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strBtonecajqb = cllcsxoeiz.btonecajqb(this);
        zdlpuopuiu.dxjokdxxww(strBtonecajqb, "renderLambdaToString(...)");
        return strBtonecajqb;
    }
}
