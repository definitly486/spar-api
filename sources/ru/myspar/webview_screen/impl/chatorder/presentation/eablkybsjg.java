package ru.myspar.webview_screen.impl.chatorder.presentation;

import java.io.File;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104717iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 159224605;
        }

        public String toString() {
            return "CancelFileAttach";
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final File f104718iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(File fileForPhoto) {
            super(null);
            zdlpuopuiu.btonecajqb(fileForPhoto, "fileForPhoto");
            this.f104718iobyxmoadg = fileForPhoto;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104718iobyxmoadg, ((ppxfxbqfkf) obj).f104718iobyxmoadg);
        }

        public int hashCode() {
            return this.f104718iobyxmoadg.hashCode();
        }

        public final File iobyxmoadg() {
            return this.f104718iobyxmoadg;
        }

        public String toString() {
            return "TakeTempPhoto(fileForPhoto=" + this.f104718iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f104719iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1080097720;
        }

        public String toString() {
            return "ShowAttachFileDialog";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
