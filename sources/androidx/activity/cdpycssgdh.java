package androidx.activity;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class cdpycssgdh {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f2286zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final View invoke(View it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f2287zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final lereixgezr invoke(View it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            Object tag = it.getTag(pmvmpeiblj.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof lereixgezr) {
                return (lereixgezr) tag;
            }
            return null;
        }
    }

    public static final lereixgezr iobyxmoadg(View view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "<this>");
        return (lereixgezr) lj.wflxmlrfwp.lmojexxdyd(lj.wflxmlrfwp.stevsuqkhv(lj.wflxmlrfwp.agtfadlqog(view, iobyxmoadg.f2286zdlpuopuiu), zoijcleaow.f2287zdlpuopuiu));
    }

    public static final void zoijcleaow(View view, lereixgezr onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(pmvmpeiblj.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
