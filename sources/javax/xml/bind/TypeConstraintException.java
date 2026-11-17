package javax.xml.bind;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes3.dex */
public class TypeConstraintException extends RuntimeException {
    static final long serialVersionUID = -3059799699420143848L;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile Throwable f50948zdlpuopuiu;

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        if (this.f50948zdlpuopuiu != null) {
            this.f50948zdlpuopuiu.printStackTrace(printStream);
            printStream.println("--------------- linked to ------------------");
        }
        super.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.f50948zdlpuopuiu == null) {
            return super.toString();
        }
        return super.toString() + "\n - with linked exception:\n[" + this.f50948zdlpuopuiu.toString() + "]";
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }
}
