package v51;

import android.content.DialogInterface;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment;
import ru.myspar.proloyalty.core.base.api.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FixedBottomSheetFragment f116107iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f116108zoijcleaow;

        public iobyxmoadg(FixedBottomSheetFragment dialog) {
            zdlpuopuiu.btonecajqb(dialog, "dialog");
            this.f116107iobyxmoadg = dialog;
            String name = dialog.getClass().getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            this.f116108zoijcleaow = name;
        }

        @Override // v51.ppxfxbqfkf
        public String getKey() {
            return this.f116108zoijcleaow;
        }

        public final FixedBottomSheetFragment wkgbmnqykc() {
            return this.f116107iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: v51.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2881ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final xr0.iobyxmoadg f116109iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f116110zoijcleaow;

        public C2881ppxfxbqfkf(xr0.iobyxmoadg dialog) {
            zdlpuopuiu.btonecajqb(dialog, "dialog");
            this.f116109iobyxmoadg = dialog;
            String name = dialog.getClass().getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            this.f116110zoijcleaow = name;
        }

        @Override // v51.ppxfxbqfkf
        public String getKey() {
            return this.f116110zoijcleaow;
        }

        public final xr0.iobyxmoadg wkgbmnqykc() {
            return this.f116109iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BaseDialogFragment f116111iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f116112zoijcleaow;

        public zoijcleaow(BaseDialogFragment dialog) {
            zdlpuopuiu.btonecajqb(dialog, "dialog");
            this.f116111iobyxmoadg = dialog;
            String name = dialog.getClass().getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            this.f116112zoijcleaow = name;
        }

        @Override // v51.ppxfxbqfkf
        public String getKey() {
            return this.f116112zoijcleaow;
        }

        public final BaseDialogFragment wkgbmnqykc() {
            return this.f116111iobyxmoadg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static void iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar, DialogInterface dialogInterface) {
        iobyxmoadgVar.invoke();
    }

    String getKey();

    default void zoijcleaow(final tg.iobyxmoadg action) {
        zdlpuopuiu.btonecajqb(action, "action");
        if (this instanceof C2881ppxfxbqfkf) {
            ((C2881ppxfxbqfkf) this).wkgbmnqykc().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: v51.zoijcleaow
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ppxfxbqfkf.iobyxmoadg(action, dialogInterface);
                }
            });
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } else if (this instanceof zoijcleaow) {
            ((zoijcleaow) this).wkgbmnqykc().lmojexxdyd(action);
        } else {
            if (!(this instanceof iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ((iobyxmoadg) this).wkgbmnqykc().tzroggbefp(action);
        }
    }
}
