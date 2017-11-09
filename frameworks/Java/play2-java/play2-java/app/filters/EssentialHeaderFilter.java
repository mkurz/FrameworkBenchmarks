package filters;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import akka.util.ByteString;
import play.libs.streams.Accumulator;
import play.mvc.EssentialAction;
import play.mvc.EssentialFilter;
import play.mvc.Result;

public class EssentialHeaderFilter extends EssentialFilter {

    private final Executor executor;

    @Inject
    public EssentialHeaderFilter(final Executor executor) {
        super();
        this.executor = executor;
    }

    @Override
    public EssentialAction apply(final EssentialAction next) {
        return EssentialAction.of(request -> {
            final Accumulator<ByteString, Result> accumulator = next.apply(request);
            return accumulator.map(result -> result
                    //.withHeader("Foo", "Foo")
                , executor);
        });
    }

}
