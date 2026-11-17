package l8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 l8.zoijcleaow, still in use, count: 1, list:
  (r0v0 l8.zoijcleaow) from 0x001a: SPUT (r0v0 l8.zoijcleaow) l8.zoijcleaow.jyumaefscl l8.zoijcleaow
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {
    PREFER_ARGB_8888,
    PREFER_RGB_565;


    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final zoijcleaow f61850jyumaefscl = new zoijcleaow();

    static {
    }

    private zoijcleaow() {
        super(str, i);
    }

    public static zoijcleaow valueOf(String str) {
        return (zoijcleaow) Enum.valueOf(zoijcleaow.class, str);
    }

    public static zoijcleaow[] values() {
        return (zoijcleaow[]) f61849iwizpuwonk.clone();
    }
}
