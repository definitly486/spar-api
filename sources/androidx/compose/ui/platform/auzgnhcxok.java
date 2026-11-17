package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.v0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class auzgnhcxok {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Class[] f6764iobyxmoadg = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f6765jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ q5.gxszxtbevo f6766yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ boolean f6767zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(boolean z13, q5.gxszxtbevo gxszxtbevoVar, String str) {
            super(0);
            this.f6767zdlpuopuiu = z13;
            this.f6766yggfygwlhe = gxszxtbevoVar;
            this.f6765jyumaefscl = str;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            if (this.f6767zdlpuopuiu) {
                this.f6766yggfygwlhe.eablkybsjg(this.f6765jyumaefscl);
            }
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f6768zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(auzgnhcxok.gxszxtbevo(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gxszxtbevo(Object obj) {
        if (obj instanceof yzdjzghtvl.wflxmlrfwp) {
            yzdjzghtvl.wflxmlrfwp wflxmlrfwpVar = (yzdjzghtvl.wflxmlrfwp) obj;
            if (wflxmlrfwpVar.eablkybsjg() != v0.dxjokdxxww() && wflxmlrfwpVar.eablkybsjg() != v0.rgvfuqvkyq() && wflxmlrfwpVar.eablkybsjg() != v0.wflxmlrfwp()) {
                return false;
            }
            Object value = wflxmlrfwpVar.getValue();
            if (value == null) {
                return true;
            }
            return gxszxtbevo(value);
        }
        if ((obj instanceof gg.dxjokdxxww) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : f6764iobyxmoadg) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle lqeggnwhkg(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    private static final Map nufgyqmvbu(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    public static final roivzttewh ppxfxbqfkf(String str, q5.dxjokdxxww dxjokdxxwwVar) {
        boolean z13;
        String str2 = rhgxfdycjh.rgvfuqvkyq.class.getSimpleName() + ':' + str;
        q5.gxszxtbevo savedStateRegistry = dxjokdxxwwVar.getSavedStateRegistry();
        Bundle bundleIobyxmoadg = savedStateRegistry.iobyxmoadg(str2);
        final rhgxfdycjh.rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = rhgxfdycjh.kcexrzcfyt.ppxfxbqfkf(bundleIobyxmoadg != null ? nufgyqmvbu(bundleIobyxmoadg) : null, zoijcleaow.f6768zdlpuopuiu);
        try {
            savedStateRegistry.ppxfxbqfkf(str2, new q5.gxszxtbevo.zoijcleaow() { // from class: androidx.compose.ui.platform.uawqvzlxes
                @Override // q5.gxszxtbevo.zoijcleaow
                public final Bundle iobyxmoadg() {
                    return auzgnhcxok.wkgbmnqykc(rgvfuqvkyqVarPpxfxbqfkf);
                }
            });
            z13 = true;
        } catch (IllegalArgumentException unused) {
            z13 = false;
        }
        return new roivzttewh(rgvfuqvkyqVarPpxfxbqfkf, new iobyxmoadg(z13, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle wkgbmnqykc(rhgxfdycjh.rgvfuqvkyq rgvfuqvkyqVar) {
        return lqeggnwhkg(rgvfuqvkyqVar.wkgbmnqykc());
    }

    public static final roivzttewh zoijcleaow(View view, q5.dxjokdxxww dxjokdxxwwVar) {
        Object parent = view.getParent();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(a.gtknphoqwx.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return ppxfxbqfkf(strValueOf, dxjokdxxwwVar);
    }
}
