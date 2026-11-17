package z;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final w0.wkgbmnqykc f126964iobyxmoadg = w0.gxszxtbevo.zoijcleaow(1.0f, 0.0f, 2, null);

    public static final opjhrmiecq zoijcleaow(pkzmftpjix pkzmftpjixVar) {
        opjhrmiecq opjhrmiecqVarUawqvzlxes = pkzmftpjixVar.uawqvzlxes();
        if (opjhrmiecqVarUawqvzlxes != null) {
            return opjhrmiecqVarUawqvzlxes;
        }
        w.iobyxmoadg.ppxfxbqfkf("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
