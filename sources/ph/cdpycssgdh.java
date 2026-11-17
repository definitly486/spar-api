package ph;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh extends esjtqupxsv implements zh.iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f76567iobyxmoadg;

    public cdpycssgdh(Object recordComponent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recordComponent, "recordComponent");
        this.f76567iobyxmoadg = recordComponent;
    }

    @Override // zh.iwizpuwonk
    public boolean btonecajqb() {
        return false;
    }

    @Override // zh.iwizpuwonk
    public zh.cqumvgiudr getType() throws IllegalAccessException, InvocationTargetException {
        Class clsWkgbmnqykc = iobyxmoadg.f76576iobyxmoadg.wkgbmnqykc(this.f76567iobyxmoadg);
        if (clsWkgbmnqykc != null) {
            return new kcexrzcfyt(clsWkgbmnqykc);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // ph.esjtqupxsv
    public Member kegysxyocb() throws IllegalAccessException, InvocationTargetException {
        Method methodPpxfxbqfkf = iobyxmoadg.f76576iobyxmoadg.ppxfxbqfkf(this.f76567iobyxmoadg);
        if (methodPpxfxbqfkf != null) {
            return methodPpxfxbqfkf;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }
}
