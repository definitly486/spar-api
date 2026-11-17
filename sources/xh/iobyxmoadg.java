package xh;

import java.util.Set;
import jh.yfnezrywwk;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.fiwbwshyhd;
import zi.ikoacuggdj;
import zi.lmojexxdyd;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends lmojexxdyd {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ikoacuggdj f122377dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ppxfxbqfkf f122378eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f122379gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f122380lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Set f122381nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final fiwbwshyhd f122382wkgbmnqykc;

    public /* synthetic */ iobyxmoadg(fiwbwshyhd fiwbwshyhdVar, ppxfxbqfkf ppxfxbqfkfVar, boolean z13, boolean z14, Set set, ikoacuggdj ikoacuggdjVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(fiwbwshyhdVar, (i13 & 2) != 0 ? ppxfxbqfkf.INFLEXIBLE : ppxfxbqfkfVar, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? null : set, (i13 & 32) != 0 ? null : ikoacuggdjVar);
    }

    public static /* synthetic */ iobyxmoadg gxszxtbevo(iobyxmoadg iobyxmoadgVar, fiwbwshyhd fiwbwshyhdVar, ppxfxbqfkf ppxfxbqfkfVar, boolean z13, boolean z14, Set set, ikoacuggdj ikoacuggdjVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            fiwbwshyhdVar = iobyxmoadgVar.f122382wkgbmnqykc;
        }
        if ((i13 & 2) != 0) {
            ppxfxbqfkfVar = iobyxmoadgVar.f122378eablkybsjg;
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        if ((i13 & 4) != 0) {
            z13 = iobyxmoadgVar.f122379gxszxtbevo;
        }
        boolean z15 = z13;
        if ((i13 & 8) != 0) {
            z14 = iobyxmoadgVar.f122380lqeggnwhkg;
        }
        boolean z16 = z14;
        if ((i13 & 16) != 0) {
            set = iobyxmoadgVar.f122381nufgyqmvbu;
        }
        Set set2 = set;
        if ((i13 & 32) != 0) {
            ikoacuggdjVar = iobyxmoadgVar.f122377dxjokdxxww;
        }
        return iobyxmoadgVar.eablkybsjg(fiwbwshyhdVar, ppxfxbqfkfVar2, z15, z16, set2, ikoacuggdjVar);
    }

    public final iobyxmoadg btonecajqb(boolean z13) {
        return gxszxtbevo(this, null, null, z13, false, null, null, 59, null);
    }

    public final iobyxmoadg draadjrbmk(ppxfxbqfkf flexibility) {
        zdlpuopuiu.btonecajqb(flexibility, "flexibility");
        return gxszxtbevo(this, null, flexibility, false, false, null, null, 61, null);
    }

    public final boolean dxjokdxxww() {
        return this.f122379gxszxtbevo;
    }

    public final iobyxmoadg eablkybsjg(fiwbwshyhd howThisTypeIsUsed, ppxfxbqfkf flexibility, boolean z13, boolean z14, Set set, ikoacuggdj ikoacuggdjVar) {
        zdlpuopuiu.btonecajqb(howThisTypeIsUsed, "howThisTypeIsUsed");
        zdlpuopuiu.btonecajqb(flexibility, "flexibility");
        return new iobyxmoadg(howThisTypeIsUsed, flexibility, z13, z14, set, ikoacuggdjVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(iobyxmoadgVar.iobyxmoadg(), iobyxmoadg()) && iobyxmoadgVar.zoijcleaow() == zoijcleaow() && iobyxmoadgVar.f122378eablkybsjg == this.f122378eablkybsjg && iobyxmoadgVar.f122379gxszxtbevo == this.f122379gxszxtbevo && iobyxmoadgVar.f122380lqeggnwhkg == this.f122380lqeggnwhkg;
    }

    public iobyxmoadg gtknphoqwx(ikoacuggdj ikoacuggdjVar) {
        return gxszxtbevo(this, null, null, false, false, null, ikoacuggdjVar, 31, null);
    }

    @Override // zi.lmojexxdyd
    public int hashCode() {
        ikoacuggdj ikoacuggdjVarIobyxmoadg = iobyxmoadg();
        int iHashCode = ikoacuggdjVarIobyxmoadg != null ? ikoacuggdjVarIobyxmoadg.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + zoijcleaow().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f122378eablkybsjg.hashCode();
        int i13 = iHashCode3 + (iHashCode3 * 31) + (this.f122379gxszxtbevo ? 1 : 0);
        return i13 + (i13 * 31) + (this.f122380lqeggnwhkg ? 1 : 0);
    }

    @Override // zi.lmojexxdyd
    public ikoacuggdj iobyxmoadg() {
        return this.f122377dxjokdxxww;
    }

    public final ppxfxbqfkf lqeggnwhkg() {
        return this.f122378eablkybsjg;
    }

    public final boolean nufgyqmvbu() {
        return this.f122380lqeggnwhkg;
    }

    @Override // zi.lmojexxdyd
    public Set ppxfxbqfkf() {
        return this.f122381nufgyqmvbu;
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f122382wkgbmnqykc + ", flexibility=" + this.f122378eablkybsjg + ", isRaw=" + this.f122379gxszxtbevo + ", isForAnnotationParameter=" + this.f122380lqeggnwhkg + ", visitedTypeParameters=" + this.f122381nufgyqmvbu + ", defaultType=" + this.f122377dxjokdxxww + ')';
    }

    @Override // zi.lmojexxdyd
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg wkgbmnqykc(yfnezrywwk typeParameter) {
        zdlpuopuiu.btonecajqb(typeParameter, "typeParameter");
        return gxszxtbevo(this, null, null, false, false, ppxfxbqfkf() != null ? hg.ikoacuggdj.wflxmlrfwp(ppxfxbqfkf(), typeParameter) : hg.ikoacuggdj.wkgbmnqykc(typeParameter), null, 47, null);
    }

    @Override // zi.lmojexxdyd
    public fiwbwshyhd zoijcleaow() {
        return this.f122382wkgbmnqykc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(fiwbwshyhd howThisTypeIsUsed, ppxfxbqfkf flexibility, boolean z13, boolean z14, Set set, ikoacuggdj ikoacuggdjVar) {
        super(howThisTypeIsUsed, set, ikoacuggdjVar);
        zdlpuopuiu.btonecajqb(howThisTypeIsUsed, "howThisTypeIsUsed");
        zdlpuopuiu.btonecajqb(flexibility, "flexibility");
        this.f122382wkgbmnqykc = howThisTypeIsUsed;
        this.f122378eablkybsjg = flexibility;
        this.f122379gxszxtbevo = z13;
        this.f122380lqeggnwhkg = z14;
        this.f122381nufgyqmvbu = set;
        this.f122377dxjokdxxww = ikoacuggdjVar;
    }
}
