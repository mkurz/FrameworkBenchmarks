package filters;

import java.util.concurrent.CompletionStage;
import java.util.function.Function;

import javax.inject.Inject;

import akka.stream.Materializer;
import play.mvc.Filter;
import play.mvc.Http;
import play.mvc.Result;

public class HeaderFilter extends Filter {

    @Inject
    public HeaderFilter(final Materializer mat) {
        super(mat);
    }

    @Override
    public CompletionStage<Result> apply(final Function<Http.RequestHeader, CompletionStage<Result>> nextFilter, final Http.RequestHeader requestHeader) {
        return nextFilter.apply(requestHeader);
            //.thenApply(result -> result.withHeader("Foo", "Foo"));
    }
}