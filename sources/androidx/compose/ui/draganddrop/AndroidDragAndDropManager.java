package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.zoijcleaow;
import d.gxszxtbevo;
import d.ppxfxbqfkf;
import d.wkgbmnqykc;
import java.util.Iterator;
import tg.vdvldrhtss;
import z.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f6142iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f6145zoijcleaow = new wkgbmnqykc(null, null, 3, null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f6143ppxfxbqfkf = new zoijcleaow(0, 1, null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.compose.ui.wkgbmnqykc f6144wkgbmnqykc = new ribwqtqdhb() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f6146zoijcleaow.f6145zoijcleaow.hashCode();
        }

        @Override // z.ribwqtqdhb
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public void draadjrbmk(wkgbmnqykc node) {
        }

        @Override // z.ribwqtqdhb
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public wkgbmnqykc btonecajqb() {
            return this.f6146zoijcleaow.f6145zoijcleaow;
        }
    };

    public AndroidDragAndDropManager(vdvldrhtss vdvldrhtssVar) {
        this.f6142iobyxmoadg = vdvldrhtssVar;
    }

    @Override // d.ppxfxbqfkf
    public void iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        this.f6143ppxfxbqfkf.add(gxszxtbevoVar);
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        d.zoijcleaow zoijcleaowVar = new d.zoijcleaow(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zH0 = this.f6145zoijcleaow.H0(zoijcleaowVar);
                Iterator<E> it = this.f6143ppxfxbqfkf.iterator();
                while (it.hasNext()) {
                    ((gxszxtbevo) it.next()).k(zoijcleaowVar);
                }
                return zH0;
            case 2:
                this.f6145zoijcleaow.h(zoijcleaowVar);
                return false;
            case 3:
                return this.f6145zoijcleaow.jrbgnlbqoe(zoijcleaowVar);
            case 4:
                this.f6145zoijcleaow.B(zoijcleaowVar);
                this.f6143ppxfxbqfkf.clear();
                return false;
            case 5:
                this.f6145zoijcleaow.M(zoijcleaowVar);
                return false;
            case 6:
                this.f6145zoijcleaow.H(zoijcleaowVar);
                return false;
            default:
                return false;
        }
    }

    public androidx.compose.ui.wkgbmnqykc wkgbmnqykc() {
        return this.f6144wkgbmnqykc;
    }

    @Override // d.ppxfxbqfkf
    public boolean zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        return this.f6143ppxfxbqfkf.contains(gxszxtbevoVar);
    }
}
