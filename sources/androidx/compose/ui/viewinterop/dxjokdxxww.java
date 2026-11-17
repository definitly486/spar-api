package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.cqumvgiudr;
import androidx.compose.ui.platform.y;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import rhgxfdycjh.rgvfuqvkyq;
import tg.draadjrbmk;
import z.opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww extends androidx.compose.ui.viewinterop.zoijcleaow implements y {

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private final s.zoijcleaow f7209crxdokpmqz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private draadjrbmk f7210ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private rgvfuqvkyq.iobyxmoadg f7211jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private final rgvfuqvkyq f7212jlmebxxoox;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private draadjrbmk f7213jztzpxfvev;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private draadjrbmk f7214okpsazkaxt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private final int f7215ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final View f7216sopmlzcsov;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private final String f7217vipkmwdibw;

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            dxjokdxxww.this.f7216sopmlzcsov.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {
        ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            dxjokdxxww.this.getResetBlock().invoke(dxjokdxxww.this.f7216sopmlzcsov);
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {
        wkgbmnqykc() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            dxjokdxxww.this.getUpdateBlock().invoke(dxjokdxxww.this.f7216sopmlzcsov);
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {
        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            dxjokdxxww.this.getReleaseBlock().invoke(dxjokdxxww.this.f7216sopmlzcsov);
            dxjokdxxww.this.pkzmftpjix();
        }
    }

    /* synthetic */ dxjokdxxww(Context context, cqumvgiudr cqumvgiudrVar, View view, s.zoijcleaow zoijcleaowVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, opjhrmiecq opjhrmiecqVar, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : cqumvgiudrVar, view, (i14 & 8) != 0 ? new s.zoijcleaow() : zoijcleaowVar, rgvfuqvkyqVar, i13, opjhrmiecqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pkzmftpjix() {
        setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(rgvfuqvkyq.iobyxmoadg iobyxmoadgVar) {
        rgvfuqvkyq.iobyxmoadg iobyxmoadgVar2 = this.f7211jhduphickx;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.iobyxmoadg();
        }
        this.f7211jhduphickx = iobyxmoadgVar;
    }

    private final void ylkuphrtab() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f7212jlmebxxoox;
        if (rgvfuqvkyqVar != null) {
            setSavableRegistryEntry(rgvfuqvkyqVar.zoijcleaow(this.f7217vipkmwdibw, new iobyxmoadg()));
        }
    }

    public final s.zoijcleaow getDispatcher() {
        return this.f7209crxdokpmqz;
    }

    public final draadjrbmk getReleaseBlock() {
        return this.f7213jztzpxfvev;
    }

    public final draadjrbmk getResetBlock() {
        return this.f7214okpsazkaxt;
    }

    @Override // androidx.compose.ui.platform.y
    public /* bridge */ /* synthetic */ androidx.compose.ui.platform.iobyxmoadg getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final draadjrbmk getUpdateBlock() {
        return this.f7210ikoacuggdj;
    }

    @Override // androidx.compose.ui.platform.y
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(draadjrbmk draadjrbmkVar) {
        this.f7213jztzpxfvev = draadjrbmkVar;
        setRelease(new zoijcleaow());
    }

    public final void setResetBlock(draadjrbmk draadjrbmkVar) {
        this.f7214okpsazkaxt = draadjrbmkVar;
        setReset(new ppxfxbqfkf());
    }

    public final void setUpdateBlock(draadjrbmk draadjrbmkVar) {
        this.f7210ikoacuggdj = draadjrbmkVar;
        setUpdate(new wkgbmnqykc());
    }

    private dxjokdxxww(Context context, cqumvgiudr cqumvgiudrVar, View view, s.zoijcleaow zoijcleaowVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, opjhrmiecq opjhrmiecqVar) {
        super(context, cqumvgiudrVar, i13, zoijcleaowVar, view, opjhrmiecqVar);
        this.f7216sopmlzcsov = view;
        this.f7209crxdokpmqz = zoijcleaowVar;
        this.f7212jlmebxxoox = rgvfuqvkyqVar;
        this.f7215ribwqtqdhb = i13;
        setClipChildren(false);
        String strValueOf = String.valueOf(i13);
        this.f7217vipkmwdibw = strValueOf;
        Object objEablkybsjg = rgvfuqvkyqVar != null ? rgvfuqvkyqVar.eablkybsjg(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objEablkybsjg instanceof SparseArray ? (SparseArray) objEablkybsjg : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        ylkuphrtab();
        this.f7210ikoacuggdj = eablkybsjg.eablkybsjg();
        this.f7214okpsazkaxt = eablkybsjg.eablkybsjg();
        this.f7213jztzpxfvev = eablkybsjg.eablkybsjg();
    }

    public dxjokdxxww(Context context, draadjrbmk draadjrbmkVar, cqumvgiudr cqumvgiudrVar, rgvfuqvkyq rgvfuqvkyqVar, int i13, opjhrmiecq opjhrmiecqVar) {
        this(context, cqumvgiudrVar, (View) draadjrbmkVar.invoke(context), null, rgvfuqvkyqVar, i13, opjhrmiecqVar, 8, null);
    }
}
