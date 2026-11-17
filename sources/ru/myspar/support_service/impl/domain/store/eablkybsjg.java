package ru.myspar.support_service.impl.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final State.Content f104466iobyxmoadg;

        public iobyxmoadg(State.Content content) {
            zdlpuopuiu.btonecajqb(content, "content");
            this.f104466iobyxmoadg = content;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104466iobyxmoadg, ((iobyxmoadg) obj).f104466iobyxmoadg);
        }

        public int hashCode() {
            return this.f104466iobyxmoadg.hashCode();
        }

        public final State.Content iobyxmoadg() {
            return this.f104466iobyxmoadg;
        }

        public String toString() {
            return "SetContent(content=" + this.f104466iobyxmoadg + ")";
        }
    }
}
