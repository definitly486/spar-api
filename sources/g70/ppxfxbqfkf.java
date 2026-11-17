package g70;

import android.content.DialogInterface;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment;
import ru.myspar.core.base.api.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FixedBottomSheetFragment f36559iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f36560zoijcleaow;

        public iobyxmoadg(FixedBottomSheetFragment dialog) {
            zdlpuopuiu.btonecajqb(dialog, "dialog");
            this.f36559iobyxmoadg = dialog;
            String name = dialog.getClass().getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            this.f36560zoijcleaow = name;
        }

        @Override // g70.ppxfxbqfkf
        public String getKey() {
            return this.f36560zoijcleaow;
        }

        public final FixedBottomSheetFragment wkgbmnqykc() {
            return this.f36559iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: g70.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C0822ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dt.iobyxmoadg f36561iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f36562zoijcleaow;

        public C0822ppxfxbqfkf(dt.iobyxmoadg dialog) {
            zdlpuopuiu.btonecajqb(dialog, "dialog");
            this.f36561iobyxmoadg = dialog;
            String name = dialog.getClass().getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            this.f36562zoijcleaow = name;
        }

        @Override // g70.ppxfxbqfkf
        public String getKey() {
            return this.f36562zoijcleaow;
        }

        public final dt.iobyxmoadg wkgbmnqykc() {
            return this.f36561iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final BaseDialogFragment f36563iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f36564zoijcleaow;

        public zoijcleaow(BaseDialogFragment dialog) {
            zdlpuopuiu.btonecajqb(dialog, "dialog");
            this.f36563iobyxmoadg = dialog;
            String name = dialog.getClass().getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            this.f36564zoijcleaow = name;
        }

        @Override // g70.ppxfxbqfkf
        public String getKey() {
            return this.f36564zoijcleaow;
        }

        public final BaseDialogFragment wkgbmnqykc() {
            return this.f36563iobyxmoadg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static void iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar, DialogInterface dialogInterface) {
        iobyxmoadgVar.invoke();
    }

    String getKey();

    default void zoijcleaow(final tg.iobyxmoadg action) {
        zdlpuopuiu.btonecajqb(action, "action");
        if (this instanceof C0822ppxfxbqfkf) {
            ((C0822ppxfxbqfkf) this).wkgbmnqykc().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: g70.zoijcleaow
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
