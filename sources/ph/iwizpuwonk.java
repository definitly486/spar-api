package ph;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class iwizpuwonk extends esjtqupxsv implements zh.agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Field f76584iobyxmoadg;

    public iwizpuwonk(Field member) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(member, "member");
        this.f76584iobyxmoadg = member;
    }

    @Override // zh.agtfadlqog
    public boolean dsvhmnatus() {
        return false;
    }

    @Override // ph.esjtqupxsv
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public Field kegysxyocb() {
        return this.f76584iobyxmoadg;
    }

    @Override // zh.agtfadlqog
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public yadqdtsiqt getType() {
        yadqdtsiqt.iobyxmoadg iobyxmoadgVar = yadqdtsiqt.f76617iobyxmoadg;
        Type genericType = kegysxyocb().getGenericType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(genericType, "getGenericType(...)");
        return iobyxmoadgVar.iobyxmoadg(genericType);
    }

    @Override // zh.agtfadlqog
    public boolean pkzmftpjix() {
        return kegysxyocb().isEnumConstant();
    }
}
