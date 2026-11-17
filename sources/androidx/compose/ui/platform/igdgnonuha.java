package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class igdgnonuha {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ View f6970yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f6971zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(View view, View view2) {
            super(1);
            this.f6971zdlpuopuiu = view;
            this.f6970yggfygwlhe = view2;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(igdgnonuha.nufgyqmvbu(this.f6971zdlpuopuiu, view, view.getNextFocusForwardId()) == this.f6970yggfygwlhe);
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f6972zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(int i13) {
            super(1);
            this.f6972zdlpuopuiu = i13;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getId() == this.f6972zdlpuopuiu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View eablkybsjg(View view, View view2, int i13) {
        int nextFocusForwardId;
        if (i13 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return gxszxtbevo(view2, view, new iobyxmoadg(view2, view));
        }
        if (i13 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return nufgyqmvbu(view2, view, nextFocusForwardId);
        }
        return null;
    }

    private static final View gxszxtbevo(View view, View view2, tg.draadjrbmk draadjrbmkVar) {
        View viewLqeggnwhkg;
        View view3 = null;
        while (true) {
            viewLqeggnwhkg = lqeggnwhkg(view2, draadjrbmkVar, view3);
            if (viewLqeggnwhkg != null || view2 == view) {
                break;
            }
            Object parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            View view4 = (View) parent;
            view3 = view2;
            view2 = view4;
        }
        return viewLqeggnwhkg;
    }

    private static final View lqeggnwhkg(View view, tg.draadjrbmk draadjrbmkVar, View view2) {
        View viewLqeggnwhkg;
        if (((Boolean) draadjrbmkVar.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt != view2 && (viewLqeggnwhkg = lqeggnwhkg(childAt, draadjrbmkVar, view2)) != null) {
                return viewLqeggnwhkg;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View nufgyqmvbu(View view, View view2, int i13) {
        return gxszxtbevo(view, view2, new zoijcleaow(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(View view, ArrayList arrayList, int i13) {
        view.addFocusables(arrayList, i13, view.isInTouchMode() ? 1 : 0);
    }
}
