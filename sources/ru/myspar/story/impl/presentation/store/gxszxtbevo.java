package ru.myspar.story.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.Content f104339iobyxmoadg;

        public iobyxmoadg(State.Content content) {
            zdlpuopuiu.btonecajqb(content, "content");
            this.f104339iobyxmoadg = content;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104339iobyxmoadg, ((iobyxmoadg) obj).f104339iobyxmoadg);
        }

        public int hashCode() {
            return this.f104339iobyxmoadg.hashCode();
        }

        public final State.Content iobyxmoadg() {
            return this.f104339iobyxmoadg;
        }

        public String toString() {
            return "SetContent(content=" + this.f104339iobyxmoadg + ")";
        }
    }
}
