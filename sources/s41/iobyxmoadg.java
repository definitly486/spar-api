package s41;

import android.text.Editable;
import android.text.Html;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements Html.TagHandler {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinkedList f105498iobyxmoadg = new LinkedList();

    /* JADX INFO: renamed from: s41.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2566iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f105499iobyxmoadg;

        public C2566iobyxmoadg(boolean z13) {
            this.f105499iobyxmoadg = z13 ? 1 : -1;
        }

        public final C2566iobyxmoadg iobyxmoadg(Editable output, int i13) {
            zdlpuopuiu.btonecajqb(output, "output");
            if (output.length() > 0 && !kcexrzcfyt.zynmafqrjb(output.toString(), "\n", false, 2, null)) {
                output.append("\n");
            }
            for (int i14 = 0; i14 < i13; i14++) {
                output.append("\t");
            }
            int i15 = this.f105499iobyxmoadg;
            if (i15 != -1) {
                output.append((CharSequence) String.valueOf(i15)).append('.').append(' ');
                this.f105499iobyxmoadg++;
            } else {
                output.append((char) 8226).append(' ');
            }
            return this;
        }
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z13, String tag, Editable output, XMLReader xmlReader) {
        Object next;
        zdlpuopuiu.btonecajqb(tag, "tag");
        zdlpuopuiu.btonecajqb(output, "output");
        zdlpuopuiu.btonecajqb(xmlReader, "xmlReader");
        Iterator<E> it = ppxfxbqfkf.wkgbmnqykc().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kcexrzcfyt.istkbnxepw(((ppxfxbqfkf) next).lqeggnwhkg(), tag, true));
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) next;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.TagUL;
            if ((ppxfxbqfkfVar == ppxfxbqfkfVar2 || ppxfxbqfkfVar == ppxfxbqfkf.TagOL) && z13) {
                this.f105498iobyxmoadg.addFirst(new C2566iobyxmoadg(ppxfxbqfkfVar == ppxfxbqfkf.TagOL));
                return;
            }
            if (ppxfxbqfkfVar == ppxfxbqfkfVar2 || ppxfxbqfkfVar == ppxfxbqfkf.TagOL) {
                this.f105498iobyxmoadg.removeFirst();
                if (this.f105498iobyxmoadg.isEmpty()) {
                    output.append('\n');
                    return;
                }
                return;
            }
            if (ppxfxbqfkfVar == ppxfxbqfkf.TagLI && z13 && !this.f105498iobyxmoadg.isEmpty()) {
                ((C2566iobyxmoadg) this.f105498iobyxmoadg.getFirst()).iobyxmoadg(output, 1);
            }
        }
    }
}
