package androidx.collection;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ntlheqmsrt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object[] f4347iobyxmoadg = new Object[0];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final mbcevpiqjq f4348zoijcleaow = new jpowsppfya(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(List list, int i13, int i14) {
        int size = list.size();
        if (i13 > i14) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Indices are out of order. fromIndex (" + i13 + ") is greater than toIndex (" + i14 + ").");
        }
        if (i13 < 0) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("fromIndex (" + i13 + ") is less than 0.");
        }
        if (i14 > size) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("toIndex (" + i14 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final mbcevpiqjq gxszxtbevo() {
        mbcevpiqjq mbcevpiqjqVar = f4348zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(mbcevpiqjqVar, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return mbcevpiqjqVar;
    }

    public static final jpowsppfya lqeggnwhkg(Object obj) {
        jpowsppfya jpowsppfyaVar = new jpowsppfya(1);
        jpowsppfyaVar.agtfadlqog(obj);
        return jpowsppfyaVar;
    }

    public static final jpowsppfya nufgyqmvbu(Object obj, Object obj2) {
        jpowsppfya jpowsppfyaVar = new jpowsppfya(2);
        jpowsppfyaVar.agtfadlqog(obj);
        jpowsppfyaVar.agtfadlqog(obj2);
        return jpowsppfyaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(List list, int i13) {
        int size = list.size();
        if (i13 < 0 || i13 >= size) {
            jlmebxxoox.wkgbmnqykc.ppxfxbqfkf("Index " + i13 + " is out of bounds. The list has " + size + " elements.");
        }
    }
}
