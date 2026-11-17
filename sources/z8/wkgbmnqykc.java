package z8;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc implements zoijcleaow {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final zoijcleaow.iobyxmoadg f129307yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f129308zdlpuopuiu;

    wkgbmnqykc(Context context, zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        this.f129308zdlpuopuiu = context.getApplicationContext();
        this.f129307yggfygwlhe = iobyxmoadgVar;
    }

    private void eablkybsjg() {
        oxmwwwfdhm.iobyxmoadg(this.f129308zdlpuopuiu).eablkybsjg(this.f129307yggfygwlhe);
    }

    private void wkgbmnqykc() {
        oxmwwwfdhm.iobyxmoadg(this.f129308zdlpuopuiu).wkgbmnqykc(this.f129307yggfygwlhe);
    }

    @Override // z8.draadjrbmk
    public void onDestroy() {
    }

    @Override // z8.draadjrbmk
    public void onStart() {
        wkgbmnqykc();
    }

    @Override // z8.draadjrbmk
    public void onStop() {
        eablkybsjg();
    }
}
