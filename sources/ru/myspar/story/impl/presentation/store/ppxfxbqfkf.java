package ru.myspar.story.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.story.api.model.StoryPayload;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StoryPayload f104351iobyxmoadg;

        public iobyxmoadg(StoryPayload args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f104351iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104351iobyxmoadg, ((iobyxmoadg) obj).f104351iobyxmoadg);
        }

        public int hashCode() {
            return this.f104351iobyxmoadg.hashCode();
        }

        public final StoryPayload iobyxmoadg() {
            return this.f104351iobyxmoadg;
        }

        public String toString() {
            return "Init(args=" + this.f104351iobyxmoadg + ")";
        }
    }
}
