package js1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zoijcleaow f52280yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f52281zdlpuopuiu;

    public ppxfxbqfkf(String itemId, zoijcleaow itemsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(itemsUiModel, "itemsUiModel");
        this.f52281zdlpuopuiu = itemId;
        this.f52280yggfygwlhe = itemsUiModel;
    }

    public static /* synthetic */ ppxfxbqfkf wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, String str, zoijcleaow zoijcleaowVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = ppxfxbqfkfVar.f52281zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            zoijcleaowVar = ppxfxbqfkfVar.f52280yggfygwlhe;
        }
        return ppxfxbqfkfVar.iobyxmoadg(str, zoijcleaowVar);
    }

    public final zoijcleaow eablkybsjg() {
        return this.f52280yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f52281zdlpuopuiu, ppxfxbqfkfVar.f52281zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f52280yggfygwlhe, ppxfxbqfkfVar.f52280yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f52281zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f52281zdlpuopuiu.hashCode() * 31) + this.f52280yggfygwlhe.hashCode();
    }

    public final ppxfxbqfkf iobyxmoadg(String itemId, zoijcleaow itemsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(itemsUiModel, "itemsUiModel");
        return new ppxfxbqfkf(itemId, itemsUiModel);
    }

    public String toString() {
        return "QuestionSpecialBannerUiModel(itemId=" + this.f52281zdlpuopuiu + ", itemsUiModel=" + this.f52280yggfygwlhe + ")";
    }
}
