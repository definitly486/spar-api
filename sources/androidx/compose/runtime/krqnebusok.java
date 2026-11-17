package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
final class krqnebusok implements eslsurpljm, iwxlajgraz {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lg.btonecajqb f5711yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final /* synthetic */ iwxlajgraz f5712zdlpuopuiu;

    public krqnebusok(iwxlajgraz iwxlajgrazVar, lg.btonecajqb btonecajqbVar) {
        this.f5712zdlpuopuiu = iwxlajgrazVar;
        this.f5711yggfygwlhe = btonecajqbVar;
    }

    @Override // pj.cllcsxoeiz
    public lg.btonecajqb getCoroutineContext() {
        return this.f5711yggfygwlhe;
    }

    @Override // androidx.compose.runtime.iwxlajgraz, androidx.compose.runtime.i1
    public Object getValue() {
        return this.f5712zdlpuopuiu.getValue();
    }

    @Override // androidx.compose.runtime.iwxlajgraz
    public void setValue(Object obj) {
        this.f5712zdlpuopuiu.setValue(obj);
    }
}
