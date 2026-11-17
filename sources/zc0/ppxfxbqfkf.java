package zc0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f129584iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f129585jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f129586yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f129587zdlpuopuiu;

    public ppxfxbqfkf(String itemId, String code, String name, String str) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f129587zdlpuopuiu = itemId;
        this.f129586yggfygwlhe = code;
        this.f129585jyumaefscl = name;
        this.f129584iwizpuwonk = str;
    }

    public final String eablkybsjg() {
        return this.f129584iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f129587zdlpuopuiu, ppxfxbqfkfVar.f129587zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f129586yggfygwlhe, ppxfxbqfkfVar.f129586yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f129585jyumaefscl, ppxfxbqfkfVar.f129585jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f129584iwizpuwonk, ppxfxbqfkfVar.f129584iwizpuwonk);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f129587zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f129587zdlpuopuiu.hashCode() * 31) + this.f129586yggfygwlhe.hashCode()) * 31) + this.f129585jyumaefscl.hashCode()) * 31;
        String str = this.f129584iwizpuwonk;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f129586yggfygwlhe;
    }

    public String toString() {
        return "SponsorUiModel(itemId=" + this.f129587zdlpuopuiu + ", code=" + this.f129586yggfygwlhe + ", name=" + this.f129585jyumaefscl + ", pic=" + this.f129584iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f129585jyumaefscl;
    }
}
