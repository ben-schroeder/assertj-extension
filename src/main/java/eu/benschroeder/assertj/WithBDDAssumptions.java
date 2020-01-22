package eu.benschroeder.assertj;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.assertj.core.api.AbstractBigIntegerAssert;
import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.assertj.core.api.AbstractBooleanAssert;
import org.assertj.core.api.AbstractByteArrayAssert;
import org.assertj.core.api.AbstractByteAssert;
import org.assertj.core.api.AbstractCharArrayAssert;
import org.assertj.core.api.AbstractCharSequenceAssert;
import org.assertj.core.api.AbstractCharacterAssert;
import org.assertj.core.api.AbstractClassAssert;
import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.api.AbstractDateAssert;
import org.assertj.core.api.AbstractDoubleArrayAssert;
import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.api.AbstractFileAssert;
import org.assertj.core.api.AbstractFloatArrayAssert;
import org.assertj.core.api.AbstractFloatAssert;
import org.assertj.core.api.AbstractFutureAssert;
import org.assertj.core.api.AbstractInputStreamAssert;
import org.assertj.core.api.AbstractInstantAssert;
import org.assertj.core.api.AbstractIntArrayAssert;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.AbstractListAssert;
import org.assertj.core.api.AbstractLocalDateAssert;
import org.assertj.core.api.AbstractLocalDateTimeAssert;
import org.assertj.core.api.AbstractLocalTimeAssert;
import org.assertj.core.api.AbstractLongArrayAssert;
import org.assertj.core.api.AbstractLongAssert;
import org.assertj.core.api.AbstractMapAssert;
import org.assertj.core.api.AbstractOffsetDateTimeAssert;
import org.assertj.core.api.AbstractOffsetTimeAssert;
import org.assertj.core.api.AbstractPathAssert;
import org.assertj.core.api.AbstractShortArrayAssert;
import org.assertj.core.api.AbstractShortAssert;
import org.assertj.core.api.AbstractSpliteratorAssert;
import org.assertj.core.api.AbstractStringAssert;
import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.AbstractUriAssert;
import org.assertj.core.api.AbstractUrlAssert;
import org.assertj.core.api.AbstractZonedDateTimeAssert;
import org.assertj.core.api.AtomicBooleanAssert;
import org.assertj.core.api.AtomicIntegerArrayAssert;
import org.assertj.core.api.AtomicIntegerAssert;
import org.assertj.core.api.AtomicIntegerFieldUpdaterAssert;
import org.assertj.core.api.AtomicLongArrayAssert;
import org.assertj.core.api.AtomicLongAssert;
import org.assertj.core.api.AtomicLongFieldUpdaterAssert;
import org.assertj.core.api.AtomicMarkableReferenceAssert;
import org.assertj.core.api.AtomicReferenceArrayAssert;
import org.assertj.core.api.AtomicReferenceAssert;
import org.assertj.core.api.AtomicReferenceFieldUpdaterAssert;
import org.assertj.core.api.AtomicStampedReferenceAssert;
import org.assertj.core.api.BDDAssumptions;
import org.assertj.core.api.CompletableFutureAssert;
import org.assertj.core.api.DoublePredicateAssert;
import org.assertj.core.api.FactoryBasedNavigableListAssert;
import org.assertj.core.api.IntPredicateAssert;
import org.assertj.core.api.IteratorAssert;
import org.assertj.core.api.LongPredicateAssert;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.OptionalAssert;
import org.assertj.core.api.OptionalDoubleAssert;
import org.assertj.core.api.OptionalIntAssert;
import org.assertj.core.api.OptionalLongAssert;
import org.assertj.core.api.ProxyableIterableAssert;
import org.assertj.core.api.ProxyableListAssert;
import org.assertj.core.api.ProxyableObjectArrayAssert;
import org.assertj.core.api.ProxyableObjectAssert;
import org.assertj.core.api.ProxyablePredicateAssert;
import org.assertj.core.api.ThrowableAssert;

import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * AssertJ {@link BDDAssumptions} as an interface to use in test classes.
 * <p>
 * Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 *
 * @author Benjamin Schröder
 */
public interface WithBDDAssumptions {

  /**
   * @see BDDAssumptions#given(boolean)
   */
  default AbstractBooleanAssert<?> given(boolean actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Boolean)
   */
  default AbstractBooleanAssert<?> given(Boolean actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(boolean[])
   */
  default AbstractBooleanArrayAssert<?> given(boolean[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(byte)
   */
  default AbstractByteAssert<?> given(byte actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Byte)
   */
  default AbstractByteAssert<?> given(Byte actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(byte[])
   */
  default AbstractByteArrayAssert<?> given(byte[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(short)
   */
  default AbstractShortAssert<?> given(short actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Short)
   */
  default AbstractShortAssert<?> given(Short actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(short[])
   */
  default AbstractShortArrayAssert<?> given(short[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(int)
   */
  default AbstractIntegerAssert<?> given(int actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Integer)
   */
  default AbstractIntegerAssert<?> given(Integer actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(int[])
   */
  default AbstractIntArrayAssert<?> given(int[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(BigInteger)
   */
  default AbstractBigIntegerAssert<?> given(BigInteger actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(long)
   */
  default AbstractLongAssert<?> given(long actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Long)
   */
  default AbstractLongAssert<?> given(Long actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(long[])
   */
  default AbstractLongArrayAssert<?> given(long[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(float)
   */
  default AbstractFloatAssert<?> given(float actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Float)
   */
  default AbstractFloatAssert<?> given(Float actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(float[])
   */
  default AbstractFloatArrayAssert<?> given(float[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(double)
   */
  default AbstractDoubleAssert<?> given(double actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Double)
   */
  default AbstractDoubleAssert<?> given(Double actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(double[])
   */
  default AbstractDoubleArrayAssert<?> given(double[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(BigDecimal)
   */
  default AbstractBigDecimalAssert<?> given(BigDecimal actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(char)
   */
  default AbstractCharacterAssert<?> given(char actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Character)
   */
  default AbstractCharacterAssert<?> given(Character actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(char[])
   */
  default AbstractCharArrayAssert<?> given(char[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(CharSequence)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> given(CharSequence actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(String)
   */
  default AbstractStringAssert<?> given(String actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(StringBuilder)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> given(StringBuilder actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(StringBuffer)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> given(StringBuffer actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Class)
   */
  default AbstractClassAssert<?> given(Class<?> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(T)
   */
  default <T> ProxyableObjectAssert<T> given(T actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(T[])
   */
  default <T> ProxyableObjectArrayAssert<T> given(T[] actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(T)
   */
  default <T> ProxyableObjectAssert<T> givenObject(T actual) {
    return BDDAssumptions.givenObject(actual);
  }

  /**
   * @see BDDAssumptions#given(Comparable)
   */
  @SuppressWarnings("unchecked")
  default <T extends Comparable<? super T>> AbstractComparableAssert<?, T> given(Comparable<? super T> actual) {
    return BDDAssumptions.given((T) actual);
  }

  /**
   * @see BDDAssumptions#given(Throwable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> given(Throwable actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#givenCode(org.assertj.core.api.ThrowableAssert.ThrowingCallable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> givenCode(ThrowableAssert.ThrowingCallable lambda) {
    return BDDAssumptions.givenCode(lambda);
  }

  /**
   * @see BDDAssumptions#given(Iterable)
   */
  default <ELEMENT> ProxyableIterableAssert<ELEMENT> given(Iterable<? extends ELEMENT> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Iterator)
   */
  default <ELEMENT> IteratorAssert<ELEMENT> given(Iterator<? extends ELEMENT> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(List)
   */
  default <ELEMENT> FactoryBasedNavigableListAssert<ProxyableListAssert<ELEMENT>, List<? extends ELEMENT>, ELEMENT, ObjectAssert<ELEMENT>> given(List<? extends ELEMENT> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Map)
   */
  default <K, V> AbstractMapAssert<?, ?, K, V> given(Map<K, V> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Predicate)
   */
  default <T> ProxyablePredicateAssert<T> given(Predicate<T> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(IntPredicate)
   */
  default IntPredicateAssert given(IntPredicate actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(LongPredicate)
   */
  default LongPredicateAssert given(LongPredicate actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(DoublePredicate)
   */
  default DoublePredicateAssert given(DoublePredicate actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Optional)
   */
  @SuppressWarnings("unchecked")
  default <VALUE> OptionalAssert<VALUE> given(Optional<VALUE> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(OptionalInt)
   */
  default OptionalIntAssert given(OptionalInt actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(OptionalLong)
   */
  default OptionalLongAssert given(OptionalLong actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(OptionalDouble)
   */
  default OptionalDoubleAssert given(OptionalDouble actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Stream)
   */
  default <ELEMENT> AbstractListAssert<?, List<? extends ELEMENT>, ELEMENT, ObjectAssert<ELEMENT>> given(Stream<? extends ELEMENT> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(IntStream)
   */
  default AbstractListAssert<?, List<? extends Integer>, Integer, ObjectAssert<Integer>> given(IntStream actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Spliterator)
   */
  default <ELEMENT> AbstractSpliteratorAssert<?, ELEMENT> given(Spliterator<ELEMENT> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(LongStream)
   */
  default AbstractListAssert<?, List<? extends Long>, Long, ObjectAssert<Long>> given(LongStream actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(DoubleStream)
   */
  default AbstractListAssert<?, List<? extends Double>, Double, ObjectAssert<Double>> given(DoubleStream actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Future)
   */
  default <RESULT> AbstractFutureAssert<?, ? extends Future<? extends RESULT>, RESULT> given(Future<RESULT> future) {
    return BDDAssumptions.given(future);
  }

  /**
   * @see BDDAssumptions#given(CompletableFuture)
   */
  default <RESULT> CompletableFutureAssert<RESULT> given(CompletableFuture<RESULT> future) {
    return BDDAssumptions.given(future);
  }

  /**
   * @see BDDAssumptions#given(CompletionStage)
   */
  default <RESULT> CompletableFutureAssert<RESULT> given(CompletionStage<RESULT> stage) {
    return BDDAssumptions.given(stage);
  }

  /**
   * @see BDDAssumptions#given(AtomicBoolean)
   */
  default AtomicBooleanAssert given(AtomicBoolean actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicInteger)
   */
  default AtomicIntegerAssert given(AtomicInteger actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicIntegerArray)
   */
  default AtomicIntegerArrayAssert given(AtomicIntegerArray actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicIntegerFieldUpdater)
   */
  default <OBJECT> AtomicIntegerFieldUpdaterAssert<OBJECT> given(AtomicIntegerFieldUpdater<OBJECT> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicLong)
   */
  default AtomicLongAssert given(AtomicLong actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicLongArray)
   */
  default AtomicLongArrayAssert given(AtomicLongArray actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicLongFieldUpdater)
   */
  default <OBJECT> AtomicLongFieldUpdaterAssert<OBJECT> given(AtomicLongFieldUpdater<OBJECT> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicReference)
   */
  default <VALUE> AtomicReferenceAssert<VALUE> given(AtomicReference<VALUE> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicReferenceArray)
   */
  default <ELEMENT> AtomicReferenceArrayAssert<ELEMENT> given(AtomicReferenceArray<ELEMENT> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicReferenceFieldUpdater)
   */
  default <FIELD, OBJECT> AtomicReferenceFieldUpdaterAssert<FIELD, OBJECT> given(AtomicReferenceFieldUpdater<OBJECT, FIELD> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicMarkableReference)
   */
  default <VALUE> AtomicMarkableReferenceAssert<VALUE> given(AtomicMarkableReference<VALUE> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(AtomicStampedReference)
   */
  default <VALUE> AtomicStampedReferenceAssert<VALUE> given(AtomicStampedReference<VALUE> actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Date)
   */
  default AbstractDateAssert<?> given(Date actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(LocalDate)
   */
  default AbstractLocalDateAssert<?> given(LocalDate actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(LocalTime)
   */
  default AbstractLocalTimeAssert<?> given(LocalTime actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(OffsetTime)
   */
  default AbstractOffsetTimeAssert<?> given(OffsetTime actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(LocalDateTime)
   */
  default AbstractLocalDateTimeAssert<?> given(LocalDateTime actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Instant)
   */
  default AbstractInstantAssert<?> given(Instant actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(OffsetDateTime)
   */
  default AbstractOffsetDateTimeAssert<?> given(OffsetDateTime actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(ZonedDateTime)
   */
  default AbstractZonedDateTimeAssert<?> given(ZonedDateTime actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(InputStream)
   */
  default AbstractInputStreamAssert<?, ? extends InputStream> given(InputStream actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(File)
   */
  default AbstractFileAssert<?> given(File actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(Path)
   */
  default AbstractPathAssert<?> given(Path actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(URI)
   */
  default AbstractUriAssert<?> given(URI actual) {
    return BDDAssumptions.given(actual);
  }

  /**
   * @see BDDAssumptions#given(URL)
   */
  default AbstractUrlAssert<?> given(URL actual) {
    return BDDAssumptions.given(actual);
  }

}
