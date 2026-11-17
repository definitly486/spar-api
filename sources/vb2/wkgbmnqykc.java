package vb2;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import wb2.eablkybsjg;
import zb2.EventsPackage;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wb2.ppxfxbqfkf f116462iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f116463zoijcleaow;

    public wkgbmnqykc(wb2.ppxfxbqfkf metaProvider, eablkybsjg profileProvider) {
        zdlpuopuiu.btonecajqb(metaProvider, "metaProvider");
        zdlpuopuiu.btonecajqb(profileProvider, "profileProvider");
        this.f116462iobyxmoadg = metaProvider;
        this.f116463zoijcleaow = profileProvider;
    }

    @Override // vb2.ppxfxbqfkf
    public EventsPackage iobyxmoadg(List eventsList) {
        zdlpuopuiu.btonecajqb(eventsList, "eventsList");
        return new EventsPackage(this.f116462iobyxmoadg.iobyxmoadg(), this.f116463zoijcleaow.zoijcleaow(), eventsList);
    }
}
