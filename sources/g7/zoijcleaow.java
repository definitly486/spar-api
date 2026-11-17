package g7;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow extends iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ImageView f36554yggfygwlhe;

    public zoijcleaow(ImageView imageView) {
        this.f36554yggfygwlhe = imageView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(getView(), ((zoijcleaow) obj).getView());
    }

    @Override // g7.wkgbmnqykc
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public ImageView getView() {
        return this.f36554yggfygwlhe;
    }

    @Override // g7.iobyxmoadg
    public void gxszxtbevo(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public int hashCode() {
        return getView().hashCode();
    }

    @Override // g7.iobyxmoadg
    public Drawable wkgbmnqykc() {
        return getView().getDrawable();
    }
}
