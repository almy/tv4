package com.myftiu.tv4.model;

/**
 * @author by ali myftiu on 27/11/14.
 */
public class Partecipant {

	private String name;
	private String description;
	private String person_tag;
	private String twitter;
	private String facebook_page;
	private String imageUrl;


	public Partecipant() {
	}

	public Partecipant(String person_tag)
	{
		this.person_tag = person_tag;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getPerson_tag()
	{
		return person_tag;
	}

	public void setPerson_tag(String person_tag)
	{
		this.person_tag = person_tag;
	}

	public String getTwitter()
	{
		return twitter;
	}

	public void setTwitter(String twitter)
	{
		this.twitter = twitter;
	}

	public String getFacebook_page()
	{
		return facebook_page;
	}

	public void setFacebook_page(String facebook_page)
	{
		this.facebook_page = facebook_page;
	}

	public String getImageUrl()
	{
		return imageUrl;
	}

	public void setImageUrl(String imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}

		Partecipant that = (Partecipant) o;

		if (description != null ? !description.equals(that.description) : that.description != null)
		{
			return false;
		}
		if (facebook_page != null ? !facebook_page.equals(that.facebook_page) : that.facebook_page != null)
		{
			return false;
		}
		if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null)
		{
			return false;
		}
		if (name != null ? !name.equals(that.name) : that.name != null)
		{
			return false;
		}
		if (person_tag != null ? !person_tag.equals(that.person_tag) : that.person_tag != null)
		{
			return false;
		}
		if (twitter != null ? !twitter.equals(that.twitter) : that.twitter != null)
		{
			return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (person_tag != null ? person_tag.hashCode() : 0);
		result = 31 * result + (twitter != null ? twitter.hashCode() : 0);
		result = 31 * result + (facebook_page != null ? facebook_page.hashCode() : 0);
		result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
		return result;
	}

	@Override
	public String toString()
	{
		return "Partecipant{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", person_tag='" + person_tag + '\'' +
				", twitter='" + twitter + '\'' +
				", facebook_page='" + facebook_page + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				'}';
	}
}
