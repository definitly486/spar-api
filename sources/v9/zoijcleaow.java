package v9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static Object iobyxmoadg(int i13, Object obj, iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        Object objApply;
        if (i13 < 1) {
            return iobyxmoadgVar.apply(obj);
        }
        do {
            objApply = iobyxmoadgVar.apply(obj);
            obj = ppxfxbqfkfVar.iobyxmoadg(obj, objApply);
            if (obj == null) {
                break;
            }
            i13--;
        } while (i13 >= 1);
        return objApply;
    }
}
