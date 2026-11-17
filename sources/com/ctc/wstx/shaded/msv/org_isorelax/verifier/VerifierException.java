package com.ctc.wstx.shaded.msv.org_isorelax.verifier;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
public class VerifierException extends SAXException {
    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(new PrintWriter((OutputStream) System.err, true));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new PrintWriter(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        if (printWriter == null) {
            printWriter = new PrintWriter((OutputStream) System.err, true);
        }
        super.printStackTrace(printWriter);
        Exception exception = super.getException();
        if (exception != null) {
            printWriter.println();
            printWriter.println("StackTrace of Original Exception:");
            exception.printStackTrace(printWriter);
        }
    }
}
