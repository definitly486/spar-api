package k0;

import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
final class ribwqtqdhb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ribwqtqdhb f53346iobyxmoadg = new ribwqtqdhb();

    private ribwqtqdhb() {
    }

    public static final boolean iobyxmoadg(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void zoijcleaow(StaticLayout.Builder builder, int i13, int i14) {
        builder.setLineBreakConfig(mbcevpiqjq.iobyxmoadg().setLineBreakStyle(i13).setLineBreakWordStyle(i14).build());
    }
}
