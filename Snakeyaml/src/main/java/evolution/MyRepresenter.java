package evolution;

import java.util.List;

import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

public class MyRepresenter {
	private Representer representer;
	
	public Representer getRepresenter() {
		return representer;
	}

	public MyRepresenter(Boolean ignoreNull, List<Class<?>> ignoredClasses) {
		this.representer = new Representer() {
			@Override
			protected NodeTuple representJavaBeanProperty(Object javaBean, Property property, Object propertyValue,Tag customTag) {
				if (ignoreNull == true && propertyValue == null) {// Ignore the null value.
					return null;
				}
				if (ignoredClasses != null) {
					for (Class<?> ignoredClass : ignoredClasses) {
						if (javaBean.getClass() == ignoredClass) {
							return null;
						}
					}
				}
				return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
			}
		};
	}
}
