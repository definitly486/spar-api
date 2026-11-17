package qb0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements v30.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final boolean f78396cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f78397cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f78398esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Integer f78399istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f78400iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f78401jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f78402lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final float f78403pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final ColorsUiModel f78404yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f78405yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f78406zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final float f78407zynmafqrjb;

    public ppxfxbqfkf(String itemId, String user, String str, int i13, String comment, String answer, boolean z13, float f13, float f14, Integer num, boolean z14, ColorsUiModel colorsModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(user, "user");
        zdlpuopuiu.btonecajqb(comment, "comment");
        zdlpuopuiu.btonecajqb(answer, "answer");
        zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        this.f78406zdlpuopuiu = itemId;
        this.f78405yggfygwlhe = user;
        this.f78401jyumaefscl = str;
        this.f78400iwizpuwonk = i13;
        this.f78397cqumvgiudr = comment;
        this.f78398esjtqupxsv = answer;
        this.f78402lereixgezr = z13;
        this.f78403pmvmpeiblj = f13;
        this.f78407zynmafqrjb = f14;
        this.f78399istkbnxepw = num;
        this.f78396cdpycssgdh = z14;
        this.f78404yadqdtsiqt = colorsModel;
    }

    public final int btonecajqb() {
        return this.f78400iwizpuwonk;
    }

    public final String draadjrbmk() {
        return this.f78405yggfygwlhe;
    }

    public final float dxjokdxxww() {
        return this.f78403pmvmpeiblj;
    }

    public final ColorsUiModel eablkybsjg() {
        return this.f78404yadqdtsiqt;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f78406zdlpuopuiu, ppxfxbqfkfVar.f78406zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f78405yggfygwlhe, ppxfxbqfkfVar.f78405yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f78401jyumaefscl, ppxfxbqfkfVar.f78401jyumaefscl) && this.f78400iwizpuwonk == ppxfxbqfkfVar.f78400iwizpuwonk && zdlpuopuiu.eablkybsjg(this.f78397cqumvgiudr, ppxfxbqfkfVar.f78397cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f78398esjtqupxsv, ppxfxbqfkfVar.f78398esjtqupxsv) && this.f78402lereixgezr == ppxfxbqfkfVar.f78402lereixgezr && Float.compare(this.f78403pmvmpeiblj, ppxfxbqfkfVar.f78403pmvmpeiblj) == 0 && Float.compare(this.f78407zynmafqrjb, ppxfxbqfkfVar.f78407zynmafqrjb) == 0 && zdlpuopuiu.eablkybsjg(this.f78399istkbnxepw, ppxfxbqfkfVar.f78399istkbnxepw) && this.f78396cdpycssgdh == ppxfxbqfkfVar.f78396cdpycssgdh && zdlpuopuiu.eablkybsjg(this.f78404yadqdtsiqt, ppxfxbqfkfVar.f78404yadqdtsiqt);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f78406zdlpuopuiu;
    }

    public final float gtknphoqwx() {
        return this.f78407zynmafqrjb;
    }

    public int hashCode() {
        int iHashCode = ((this.f78406zdlpuopuiu.hashCode() * 31) + this.f78405yggfygwlhe.hashCode()) * 31;
        String str = this.f78401jyumaefscl;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f78400iwizpuwonk)) * 31) + this.f78397cqumvgiudr.hashCode()) * 31) + this.f78398esjtqupxsv.hashCode()) * 31) + Boolean.hashCode(this.f78402lereixgezr)) * 31) + Float.hashCode(this.f78403pmvmpeiblj)) * 31) + Float.hashCode(this.f78407zynmafqrjb)) * 31;
        Integer num = this.f78399istkbnxepw;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.f78396cdpycssgdh)) * 31) + this.f78404yadqdtsiqt.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f78398esjtqupxsv;
    }

    public final String lqeggnwhkg() {
        return this.f78397cqumvgiudr;
    }

    public final String nufgyqmvbu() {
        return this.f78401jyumaefscl;
    }

    public final boolean ojitshcjhn() {
        return this.f78396cdpycssgdh;
    }

    public String toString() {
        return "ReviewItemUiModel(itemId=" + this.f78406zdlpuopuiu + ", user=" + this.f78405yggfygwlhe + ", date=" + this.f78401jyumaefscl + ", rating=" + this.f78400iwizpuwonk + ", comment=" + this.f78397cqumvgiudr + ", answer=" + this.f78398esjtqupxsv + ", isCollapsed=" + this.f78402lereixgezr + ", fromDegrees=" + this.f78403pmvmpeiblj + ", toDegrees=" + this.f78407zynmafqrjb + ", answerTitleRes=" + this.f78399istkbnxepw + ", isNeedToAnimate=" + this.f78396cdpycssgdh + ", colorsModel=" + this.f78404yadqdtsiqt + ")";
    }

    public final boolean wflxmlrfwp() {
        return this.f78402lereixgezr;
    }

    public final Integer wkgbmnqykc() {
        return this.f78399istkbnxepw;
    }
}
