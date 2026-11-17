package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static int f7921gxszxtbevo = -1;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    HashMap f7922eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    int f7923iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    String f7924ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    protected int f7925wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f7926zoijcleaow;

    public ppxfxbqfkf() {
        int i13 = f7921gxszxtbevo;
        this.f7923iobyxmoadg = i13;
        this.f7926zoijcleaow = i13;
        this.f7924ppxfxbqfkf = null;
    }

    abstract void eablkybsjg(Context context, AttributeSet attributeSet);

    boolean gxszxtbevo(String str) {
        String str2 = this.f7924ppxfxbqfkf;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public abstract void iobyxmoadg(HashMap map);

    public void lqeggnwhkg(HashMap map) {
    }

    public ppxfxbqfkf nufgyqmvbu(int i13) {
        this.f7926zoijcleaow = i13;
        return this;
    }

    public ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f7923iobyxmoadg = ppxfxbqfkfVar.f7923iobyxmoadg;
        this.f7926zoijcleaow = ppxfxbqfkfVar.f7926zoijcleaow;
        this.f7924ppxfxbqfkf = ppxfxbqfkfVar.f7924ppxfxbqfkf;
        this.f7925wkgbmnqykc = ppxfxbqfkfVar.f7925wkgbmnqykc;
        this.f7922eablkybsjg = ppxfxbqfkfVar.f7922eablkybsjg;
        return this;
    }

    abstract void wkgbmnqykc(HashSet hashSet);

    public abstract ppxfxbqfkf zoijcleaow();
}
