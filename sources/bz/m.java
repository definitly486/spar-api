package bz;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f17526iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Class f17527ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private LinkedHashSet f17528wkgbmnqykc = new LinkedHashSet();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Throwable f17529zoijcleaow;

    public m(Class cls, String str, Throwable th2) {
        this.f17526iobyxmoadg = (String) ag.dxjokdxxww.ppxfxbqfkf(str, "StartedThreadName is required");
        this.f17529zoijcleaow = (Throwable) ag.dxjokdxxww.ppxfxbqfkf(th2, "Stacktrace source is required");
        this.f17528wkgbmnqykc.add(cls);
    }

    private static String zoijcleaow(Throwable th2) {
        ag.dxjokdxxww.ppxfxbqfkf(th2, "Not null throwable expected");
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void iobyxmoadg(Class cls) {
        if (this.f17528wkgbmnqykc.add(cls)) {
            return;
        }
        this.f17527ppxfxbqfkf = cls;
        throw new a(this);
    }

    public void ppxfxbqfkf(Class cls) {
        this.f17528wkgbmnqykc.remove(cls);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\n\t| ");
        sb3.append("Dependency chain (started from thread - ");
        sb3.append(this.f17526iobyxmoadg);
        sb3.append(')');
        sb3.append("\n\t| ");
        Iterator it = this.f17528wkgbmnqykc.iterator();
        if (it.hasNext()) {
            Class cls = (Class) it.next();
            sb3.append("\n\t| \t\t");
            sb3.append(cls.getName());
        }
        while (it.hasNext()) {
            sb3.append("\n\t| \t\t\t\t");
            sb3.append("depends on: ");
            sb3.append(((Class) it.next()).getName());
        }
        if (this.f17527ppxfxbqfkf != null) {
            sb3.append("\n\t| \t\t\t\t");
            sb3.append("depends on (cycle is here): ");
            sb3.append(this.f17527ppxfxbqfkf.getName());
        }
        sb3.append("\n");
        sb3.append("\n");
        sb3.append("\n\t| ");
        sb3.append("Stacktrace:");
        sb3.append("\n");
        sb3.append(zoijcleaow(this.f17529zoijcleaow));
        return sb3.toString();
    }
}
