package ea;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc extends Property {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Matrix f31033iobyxmoadg;

    public wkgbmnqykc() {
        super(Matrix.class, "imageMatrixProperty");
        this.f31033iobyxmoadg = new Matrix();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f31033iobyxmoadg.set(imageView.getImageMatrix());
        return this.f31033iobyxmoadg;
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
