package q62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zoijcleaow f78022yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f78023zdlpuopuiu;

    public ppxfxbqfkf(String itemId, zoijcleaow itemsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(itemsUiModel, "itemsUiModel");
        this.f78023zdlpuopuiu = itemId;
        this.f78022yggfygwlhe = itemsUiModel;
    }

    public static /* synthetic */ ppxfxbqfkf wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, String str, zoijcleaow zoijcleaowVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = ppxfxbqfkfVar.f78023zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            zoijcleaowVar = ppxfxbqfkfVar.f78022yggfygwlhe;
        }
        return ppxfxbqfkfVar.iobyxmoadg(str, zoijcleaowVar);
    }

    public final zoijcleaow eablkybsjg() {
        return this.f78022yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f78023zdlpuopuiu, ppxfxbqfkfVar.f78023zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f78022yggfygwlhe, ppxfxbqfkfVar.f78022yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f78023zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f78023zdlpuopuiu.hashCode() * 31) + this.f78022yggfygwlhe.hashCode();
    }

    public final ppxfxbqfkf iobyxmoadg(String itemId, zoijcleaow itemsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(itemsUiModel, "itemsUiModel");
        return new ppxfxbqfkf(itemId, itemsUiModel);
    }

    public String toString() {
        return "QuestionSpecialBannerUiModel(itemId=" + this.f78023zdlpuopuiu + ", itemsUiModel=" + this.f78022yggfygwlhe + ")";
    }
}
