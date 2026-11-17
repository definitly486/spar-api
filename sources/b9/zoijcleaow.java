package b9;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f15578iobyxmoadg = new ArrayList();

    public synchronized void iobyxmoadg(ImageHeaderParser imageHeaderParser) {
        this.f15578iobyxmoadg.add(imageHeaderParser);
    }

    public synchronized List zoijcleaow() {
        return this.f15578iobyxmoadg;
    }
}
