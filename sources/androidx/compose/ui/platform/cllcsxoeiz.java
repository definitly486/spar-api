package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class cllcsxoeiz implements o {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f6775iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final b0.ppxfxbqfkf f6776ppxfxbqfkf = new b0.ppxfxbqfkf(new iobyxmoadg(), null, null, null, null, null, null, 126, null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private q f6777wkgbmnqykc = q.Hidden;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ActionMode f6778zoijcleaow;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            cllcsxoeiz.this.f6778zoijcleaow = null;
        }
    }

    public cllcsxoeiz(View view) {
        this.f6775iobyxmoadg = view;
    }

    @Override // androidx.compose.ui.platform.o
    public q getStatus() {
        return this.f6777wkgbmnqykc;
    }

    @Override // androidx.compose.ui.platform.o
    public void iobyxmoadg(g.lqeggnwhkg lqeggnwhkgVar, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, tg.iobyxmoadg iobyxmoadgVar4, tg.iobyxmoadg iobyxmoadgVar5) {
        this.f6776ppxfxbqfkf.wflxmlrfwp(lqeggnwhkgVar);
        this.f6776ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar);
        this.f6776ppxfxbqfkf.btonecajqb(iobyxmoadgVar3);
        this.f6776ppxfxbqfkf.gtknphoqwx(iobyxmoadgVar2);
        this.f6776ppxfxbqfkf.draadjrbmk(iobyxmoadgVar4);
        this.f6776ppxfxbqfkf.nufgyqmvbu(iobyxmoadgVar5);
        ActionMode actionMode = this.f6778zoijcleaow;
        if (actionMode == null) {
            this.f6777wkgbmnqykc = q.Shown;
            this.f6778zoijcleaow = p.f7028iobyxmoadg.iobyxmoadg(this.f6775iobyxmoadg, new b0.iobyxmoadg(this.f6776ppxfxbqfkf), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.o
    public void zoijcleaow() {
        this.f6777wkgbmnqykc = q.Hidden;
        ActionMode actionMode = this.f6778zoijcleaow;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f6778zoijcleaow = null;
    }
}
