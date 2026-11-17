package androidx.compose.ui.layout;

import z.tzroggbefp;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx extends kcexrzcfyt.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tzroggbefp f6481yggfygwlhe;

    public gtknphoqwx(tzroggbefp tzroggbefpVar) {
        this.f6481yggfygwlhe = tzroggbefpVar;
    }

    @Override // w0.draadjrbmk
    public float F() {
        return this.f6481yggfygwlhe.F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg
    public w0.zdlpuopuiu agtfadlqog() {
        return this.f6481yggfygwlhe.getLayoutDirection();
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return this.f6481yggfygwlhe.getDensity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg
    public int oxmwwwfdhm() {
        return this.f6481yggfygwlhe.ezmngbhpjk();
    }

    @Override // androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg
    public float wflxmlrfwp(esjtqupxsv esjtqupxsvVar, float f13) {
        return esjtqupxsvVar.zoijcleaow() != null ? ((Number) esjtqupxsvVar.zoijcleaow().invoke(this, Float.valueOf(f13))).floatValue() : this.f6481yggfygwlhe.w(esjtqupxsvVar, f13);
    }
}
