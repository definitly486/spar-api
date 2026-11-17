package k0;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
final class wypolnanlu implements okpsazkaxt {
    @Override // k0.okpsazkaxt
    public StaticLayout iobyxmoadg(jztzpxfvev jztzpxfvevVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(jztzpxfvevVar.oxmwwwfdhm(), jztzpxfvevVar.vdvldrhtss(), jztzpxfvevVar.eablkybsjg(), jztzpxfvevVar.ojitshcjhn(), jztzpxfvevVar.yggfygwlhe());
        builderObtain.setTextDirection(jztzpxfvevVar.kcexrzcfyt());
        builderObtain.setAlignment(jztzpxfvevVar.iobyxmoadg());
        builderObtain.setMaxLines(jztzpxfvevVar.agtfadlqog());
        builderObtain.setEllipsize(jztzpxfvevVar.ppxfxbqfkf());
        builderObtain.setEllipsizedWidth(jztzpxfvevVar.wkgbmnqykc());
        builderObtain.setLineSpacing(jztzpxfvevVar.draadjrbmk(), jztzpxfvevVar.wflxmlrfwp());
        builderObtain.setIncludePad(jztzpxfvevVar.lqeggnwhkg());
        builderObtain.setBreakStrategy(jztzpxfvevVar.zoijcleaow());
        builderObtain.setHyphenationFrequency(jztzpxfvevVar.gxszxtbevo());
        builderObtain.setIndents(jztzpxfvevVar.dxjokdxxww(), jztzpxfvevVar.rgvfuqvkyq());
        int i13 = Build.VERSION.SDK_INT;
        stevsuqkhv.iobyxmoadg(builderObtain, jztzpxfvevVar.nufgyqmvbu());
        if (i13 >= 28) {
            tzroggbefp.iobyxmoadg(builderObtain, jztzpxfvevVar.zdlpuopuiu());
        }
        if (i13 >= 33) {
            ribwqtqdhb.zoijcleaow(builderObtain, jztzpxfvevVar.btonecajqb(), jztzpxfvevVar.gtknphoqwx());
        }
        if (i13 >= 35) {
            jhduphickx.iobyxmoadg(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // k0.okpsazkaxt
    public boolean zoijcleaow(StaticLayout staticLayout, boolean z13) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            return ribwqtqdhb.iobyxmoadg(staticLayout);
        }
        if (i13 >= 28) {
            return z13;
        }
        return false;
    }
}
