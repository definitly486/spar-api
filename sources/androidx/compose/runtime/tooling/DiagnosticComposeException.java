package androidx.compose.runtime.tooling;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import krqnebusok.wkgbmnqykc;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lkrqnebusok/ppxfxbqfkf;", "trace", "<init>", "(Ljava/util/List;)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "zdlpuopuiu", "Ljava/util/List;", "", "getMessage", "()Ljava/lang/String;", "message", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiagnosticComposeException extends RuntimeException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final List trace;

    public DiagnosticComposeException(List list) {
        this.trace = list;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Composition stack when thrown:");
        zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        sb3.append('\n');
        zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        wkgbmnqykc.iobyxmoadg(sb3, this.trace);
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }
}
